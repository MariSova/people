package ru.netology
/* не понимаю как сделать проверку на дробное число( объясните пожалуйста */
fun main() {
    val likes = 111
    val result = when (likes % 2) {
        1 -> "человеку"
        11 -> "людям"
        else -> "людям"
    }

    println("Нравится $likes $result ")
}

