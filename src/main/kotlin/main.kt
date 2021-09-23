import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

abstract class Application {
    open fun start() {}
}

class App : Application() {
    override fun start() {
        GlobalScope.launch {
            console.log(delay(500))
        }
    }
}

fun main() {
}
