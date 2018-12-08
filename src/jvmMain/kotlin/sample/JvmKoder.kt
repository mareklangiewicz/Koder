package sample

import java.util.*

actual object KoderFactory {
    actual fun provideKoder(): Koder = JvmKoder
}

object JvmKoder: Koder {
    // TODO: use password hashCode
    override fun encode(password: String, src: ByteArray): ByteArray = Base64.getEncoder().encode(src)

    // TODO: use password hashCode
    override fun decode(password: String, src: ByteArray): ByteArray = Base64.getDecoder().decode(src)

    // TODO: use password hashCode
    override fun encodeToString(password: String, src: ByteArray): String = Base64.getEncoder().encodeToString(src)
}