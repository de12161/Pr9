internal class ProblemList(vararg problems: ISolution) {
    private val _problems: Set<TimedDecorator>

    init {
        val p = mutableSetOf<TimedDecorator>()

        problems.forEach {
            p.add(TimedDecorator(it))
        }

        _problems = p
    }

    fun printResults() {
        _problems.forEach {
            println("Вывод: ${it.solve()}")
            println()
        }
    }
}