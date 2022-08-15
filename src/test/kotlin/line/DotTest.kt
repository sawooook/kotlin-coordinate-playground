package line

import line.domain.Dot
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals

class DotTest {

    @Test
    fun `입력된 값들을 통해 Dot 클래스를 생성한다`() {
        val result = Dot(24, 24)

        assertEquals(result.x, 24)
        assertEquals(result.y, 24)
    }

    @Test
    fun `입력된 x, y의 좌표가 24를 넘으면 오류를 리턴한다`() {

        assertThrows<IllegalArgumentException> {
            Dot(25, 25)
        }
    }

    @Test
    fun `입력된 x, y의 좌표가 -24를 넘으면 오류를 리턴한다`() {

        assertThrows<IllegalArgumentException> {
            Dot(-25, -25)
        }
    }
}