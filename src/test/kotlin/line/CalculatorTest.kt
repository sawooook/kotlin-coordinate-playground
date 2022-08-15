package line

import line.domain.Calculator
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CalculatorTest {

    @Test
    fun `두점 사이의 거리를 구한댜`() {
        val result = Calculator("(10,10)-(14,15)")
            .getDistance()

        assertEquals(result, 6.4, 0.1)
    }

    @Test
    fun `입력한 점이 한개일 경우 0을 리턴한다`() {
        val result = Calculator("(10,10)")
            .getDistance()

        assertEquals(result, 0.0)
    }
}