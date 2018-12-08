package pl.mareklangiewicz.koder

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class JvmKoderTests {
    @Test
    fun testNonAsciiString() {
        val utf8String = "Gödel"
        val actual = KoderFactory.provideKoder().encodeToString("xxx", utf8String.toByteArray())
        assertEquals("R8O2ZGVs", actual)
    }
}