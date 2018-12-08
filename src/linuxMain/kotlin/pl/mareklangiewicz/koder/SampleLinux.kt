package pl.mareklangiewicz.koder

actual class Sample {
    actual fun checkMe() = 7
}

actual object Platform {
    actual val name: String = "Native"
}