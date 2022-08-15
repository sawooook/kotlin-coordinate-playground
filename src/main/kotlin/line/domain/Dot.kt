package line.domain

class Dot(
    val x: Int,
    val y: Int
) {

    init {
        if (x > 24 || y > 24 || x < -24 || y < -24) {
            throw IllegalArgumentException("좌표값은 24를 넘을 수 없습니다")
        }
    }
}
