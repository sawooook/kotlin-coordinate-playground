package line.view

class InputView {

    fun input(): String {
        println("좌표를 입력하세요.")
        return readLine()!!
    }
}