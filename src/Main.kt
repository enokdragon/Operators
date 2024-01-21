fun main() {
    var one = 1
    var two = 2

    var ans1 = one + two
    println("1 + 2 = $ans1")
    var isCompare = ans1 == one + two
    println(isCompare)

    var ans2 = one - two
    println("1 - 2 = $ans2")
    var isCompare2 = ans2 == one - two
    println(isCompare)

    var ans3 = one * two
    println("1 * 2 = $ans3")
    var isCompare3 = ans3 == one * two
    println(isCompare3)

    var ans4 = one / two
    println("1 / 2 = $ans4")
    var isCompare4 = ans4 == one / two
    println(isCompare4)

    var ans5 = one % two
    println("1 % 2 = $ans5")
    var isCompare5 = ans5 == one % two
    println(isCompare5)
}