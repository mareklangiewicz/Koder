package pl.mareklangiewicz.koder

interface Koder {
    fun encode(password: String, src: ByteArray): ByteArray
    fun decode(password: String, src: ByteArray): ByteArray
    fun encodeToString(password: String, src: ByteArray): String {
        val encoded = encode(password, src)
        return buildString(encoded.size) {
            for (byte in encoded) append(byte.toChar())
        }
    }
}

expect object KoderFactory {
    fun provideKoder(): Koder
}