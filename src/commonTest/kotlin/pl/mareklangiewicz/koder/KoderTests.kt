package pl.mareklangiewicz.koder

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class KoderTests {

    @Test
    fun testEncodeToString() {
        checkEncodeToString("Kotlin is awesome", "S290bGluIGlzIGF3ZXNvbWU=")
    }

    @Test
    fun testPaddedStrings() {
        checkEncodeToString("", "")
        checkEncodeToString("1", "MQ==")
        checkEncodeToString("22", "MjI=")
        checkEncodeToString("333", "MzMz")
        checkEncodeToString("4444", "NDQ0NA==")
    }

    private fun checkEncodeToString(input: String, expectedOutput: String) {
        assertEquals(expectedOutput, KoderFactory.provideKoder().encodeToString("xxx", input.asciiToByteArray()))
    }

    private fun String.asciiToByteArray() = ByteArray(length) {
        get(it).toByte()
    }
}
