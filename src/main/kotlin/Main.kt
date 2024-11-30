fun main() {
    val problems = arrayOf(
        TimedDecorator(Problem1)
    )

    for (i in problems.indices) {
        println("Вывод: ${problems[i].solve()}")
        println()
    }
}
