import co.l3co.health.core.config.healthModule
import org.koin.standalone.StandAloneContext

fun main() {
    StandAloneContext.startKoin(arrayListOf(healthModule))
    Application(port = 7000).init()
}