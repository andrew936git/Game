import kotlin.random.Random

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val random = Random
    do {
        var k = 1
        var check = 0
        println("Попробуйте угадать число. У Вас есть 3 попытки!")
        val num = random.nextInt(0, 10)
        while (k <= 3) {
            println("Введите Ваше число. Попытка $k")
            val input = readln().toInt()
            when {
                input == num -> {
                    println("Поздравляю вы угадали число!")
                    check = 1
                    break
                }
                input > num -> println("Загаданное число меньше!")
                input < num -> println("Загаданное число больше!")
            }
            println("Попробуйте еще раз!")
            k++
        }
        if (check == 0){
            println("Вы проиграли!")
        }
        println("Хотите сыграть еще раз? 1 – да / 0 – нет")
        check = readln().toInt()
    }while (check != 0)
}