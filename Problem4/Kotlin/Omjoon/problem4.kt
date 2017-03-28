/**
 * Created by Omjoon on 2016. 7. 18..
 */

fun main(args: Array<String>) = answer()

fun answer() = (100..999).mapNotNull(::order).max().run { println(this) }

fun order(number : Int) : Int? = (100..999).reversed().find { (it * number).isPalindrome() }?.run { this * number }

fun Int.isPalindrome() = toString().run { substring(0,3) == substring(3).reversed() }
