package pl.mareklangiewicz.koder

import kotlin.test.Test
import kotlin.test.assertTrue

class SampleTestsJS {
    @Test
    fun testHello() {
        assertTrue("JS" in hello())
    }
}