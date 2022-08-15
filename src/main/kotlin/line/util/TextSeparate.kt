package line.util

import DOT_END_SEPARATE
import DOT_START_SEPARATE
import SEPARATE_LINE
import SEPARATE_NUMBER
import line.domain.Dot

object TextSeparate {

    fun separate(text: String): List<Dot> =
        textReplace(text)
            .split(SEPARATE_LINE)
            .map { Dot(separateDot(it)[0].toInt(), separateDot(it)[1].toInt()) }

    private fun textReplace(text: String): String =
        text.filterNot {
            it.toString() in setOf(DOT_START_SEPARATE, DOT_END_SEPARATE)
        }

    private fun separateDot(dotText: String): List<String> = dotText.split(SEPARATE_NUMBER)
}
