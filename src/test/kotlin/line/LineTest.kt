package line

import line.domain.Dot
import line.domain.Line
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LineTest {

    @Test
    fun `두점 사이의 거리를 구한다 - 점이 두개일 경우`() {
        val result = Line(listOf(Dot(3, 2), Dot(7, 8)))
            .getDistance()

        assertEquals(result, 7.2, 0.1)
    }

    @Test
    fun `입력한 점이 한개일 경우 0을 리턴한다`() {
        val result = Line(listOf(Dot(3, 2)))
            .getDistance()

        assertEquals(result, 0.0)
    }
}