import io.ktor.application.*
import io.ktor.features.*
import io.ktor.serialization.*
import me.doogyb.countdown.routes.registerAnswersRoutes
import me.doogyb.countdown.routes.registerRandomGeneratorRoutes

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

fun Application.module() {
    install(ContentNegotiation) {
        json()
    }
    install(CORS) {
        anyHost()
    }
    registerRandomGeneratorRoutes()
    registerAnswersRoutes()
}