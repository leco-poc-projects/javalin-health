import co.l3co.health.core.controller.HealthControllerJavalin
import io.javalin.Javalin
import org.koin.standalone.KoinComponent
import org.koin.standalone.inject

class Application(private val port: Int) : KoinComponent {

    private val health by inject<HealthControllerJavalin>()

    fun init(): Javalin {
        val app = Javalin.create().apply {
            port(port)
            exception(Exception::class.java) { e, _ -> e.printStackTrace() }
        }.start()

        app.routes {
            app.get("/health") { ctx -> health.basic(ctx) }
            app.get("/health/complete") { ctx -> health.complete(ctx) }
        }

        return app
    }
}