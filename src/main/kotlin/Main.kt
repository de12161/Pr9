fun main() {
    val problems = listOf(
        Problem1(intArrayOf(1, 2, 2, 1), intArrayOf(2, 2)),
        Problem2(intArrayOf(1, 2, 2, 1), intArrayOf(2, 2)),
        Problem3(intArrayOf(2, 7, 11, 15), 9),
        Problem4(intArrayOf(8, 1, 2, 2, 3)),
        Problem5(intArrayOf(3, 0, 1)),
        Problem6(intArrayOf(3, 2, 3)),
        Problem7(intArrayOf(1, 2, 3, 1))
    )

    problems.forEach {
        println("Вывод: ${TimedDecorator(it).solve()}")
        println()
    }
}