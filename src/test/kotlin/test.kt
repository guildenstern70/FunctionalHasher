import net.littlelite.fphasher.hasher
import kotlin.test.Test
import kotlin.test.assertEquals

class Tests
{
    @Test
    fun testHash(): Unit
    {
        val hash = hasher("Hello, World!")
        println("Hash = $hash")
        assertEquals("JPwgpfrg2VKarxTGHVk9onE541GxFCCtX1reNxxbfXM=", hash)
    }
}

