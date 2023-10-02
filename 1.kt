// Создать консольную игру "Камень-Ножницы-Бумага" (три события). На консоль выводится выбор компьютера (случайное значение) и выбор игрока. 
// Для ускорения ввода выбора игрока можно условиться, что, например, 1 - это камень, 2 - ножницы, 3 - бумага. 

// Победитель определяется по следующим правилам:

//     Бумага побеждает камень («бумага обёртывает камень»).
//     Камень побеждает ножницы («камень затупляет или ломает ножницы»).
//     Ножницы побеждают бумагу («ножницы разрезают бумагу»).

// Если игроки показали одинаковый знак, то засчитывается ничья и игра переигрывается.

fun main () {
    fun printSelection(num: Int): String {
        if (num == 1) {
            return " камень"
        } else if (num == 2) {
            return " ножницы"
        } else if (num == 3) {
            return " бумага"
        } else {
            return " что-то пошло не так"
        }
    }

    fun getWinner (userNum:Int, computerNum:Int): String {
        if (((userNum == 3) && (computerNum == 1)) //бумага обёртывает камень
            || ((userNum == 1) && (computerNum == 2))  //камень ломает ножницы
            || ((userNum == 2) && (computerNum == 3))  //ножницы разрезают бумагу
            ) {
                return " вы победили!"
            } else if (userNum == computerNum) {
                return " ничья! "
            } else {
                return " компьютер победил!"
            }
    }

    println("введите одну из цифр: 1 - это камень, 2 - ножницы, 3 - бумага ")
    var userSelection = readLine()?.toInt() ?: 0
    println ("ваш выбор: " + printSelection(userSelection))

    var computerSelection = (Math.random() * 3).toInt() + 1
    println ("выбор компьютера: " + printSelection(computerSelection))

    println(getWinner(userSelection, computerSelection))
}