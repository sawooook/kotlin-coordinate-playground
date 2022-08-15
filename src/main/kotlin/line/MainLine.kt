package line

import line.domain.Calculator
import line.util.TextSeparate
import line.view.InputView
import line.view.OutputView

fun main() {
    val result =
        try {
            TextSeparate.separate(
                InputView().input()
            )
        } catch (e: IllegalArgumentException) {
            println("오류가 발생했습니다. 다시 좌표를 입력 해주세요.")
            TextSeparate.separate(
                InputView().input()
            )
        }


    val ans = Calculator(result).getDistance()

    OutputView().outPut(ans)
}

//(25,25)-(14,15)
