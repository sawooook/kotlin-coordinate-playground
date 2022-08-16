package line.domain.strategy

import line.domain.Dot
import kotlin.math.abs

class TriangleStrategy(
    private val dotList: List<Dot>
) {

    fun getArea(): Double {
        val withLine = getWidthLine()
        val heightLine = getHeightLine()

        return withLine * heightLine.toDouble()
    }

    private fun getHeightLine(): Int {
        val min = dotList.minOf { it.x }
        val minDot = dotList.filter { it.x == min }

        return calculateLength(minDot.first().y, minDot.last().y)
    }

    private fun calculateLength(firstDot: Int, lastDot: Int): Int {
        return abs(firstDot - lastDot)
    }

    private fun getWidthLine(): Int {
        val min = dotList.minOf { it.y }
        val minDot = dotList.filter { it.y == min }

        return calculateLength(minDot.first().x, minDot.last().x)
    }
}