package pl.mareklangiewicz.koder

actual object KoderFactory {
    actual fun provideKoder(): Koder = JsKoder
}

object JsKoder: Koder {
    // TODO: use password hashCode
    override fun encode(password: String, src: ByteArray): ByteArray {
        val buffer = js("Buffer").from(src)
        val string = buffer.toString("base64") as String
        return ByteArray(string.length) { string[it].toByte() }
    }

    // TODO: use password hashCode
    override fun decode(password: String, src: ByteArray): ByteArray {
        TODO()
    }
}