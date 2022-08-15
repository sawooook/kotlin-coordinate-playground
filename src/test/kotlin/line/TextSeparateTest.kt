package line

import line.util.TextSeparate
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TextSeparateTest {

    @Test
    fun `text 문자열을 넣으면 Dot 객체를 생성해준다 - 2개의 점 존재 시`() {
        val text = "(10,10)-(14,15)"
        val result = TextSeparate.separate(text)

        assertEquals(result.size, 2)
        assertEquals(result[0].x, 10)
        assertEquals(result[0].y, 10)
        assertEquals(result[1].x, 14)
        assertEquals(result[1].y, 15)
    }

    @Test
    fun `text 문자열을 넣으면 Dot 객체를 생성해준다 - 1개의 점 존재 시`() {
        val text = "(10,10)"
        val result = TextSeparate.separate(text)

        assertEquals(result.size, 1)
        assertEquals(result[0].x, 10)
        assertEquals(result[0].y, 10)
    }
}