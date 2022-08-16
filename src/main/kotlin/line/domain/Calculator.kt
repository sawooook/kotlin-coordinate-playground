package line.domain

import line.domain.strategy.LineStrategy
import line.domain.strategy.SquareStrategy
import line.domain.strategy.TriangleStrategy

class Calculator(
    private val dotList: List<Dot>
) {

    fun getArea(): Double {

        getAreaByStrategy()

    }

    // TODO 전략 패턴으로 개선할 것
    private fun getAreaByStrategy() {
        if (dotList.size == 2) {
            LineStrategy(dotList)
                .getArea()

        }

        if (dotList.size == 3) {
            TriangleStrategy(dotList)
                .getArea()
        }

        if (dotList.size == 4) {
            SquareStrategy(dotList)
                .getArea()
        }


        throw IllegalArgumentException("지원하지 않는 형태입니다.")
    }
}