fun main() {
    val problems = arrayOf(
        TimedDecorator(Problem1)
    )

    for (i in problems.indices) {
        print("Вывод: ${problems[i].solve()}")
        println()
    }
}
