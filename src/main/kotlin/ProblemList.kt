internal object ProblemList {
    private val _problems = mutableListOf<TimedDecorator>()

    fun addProblems(vararg problems: ISolution) {
        problems.forEach { _problems.add(TimedDecorator(it)) }
    }

    fun printResults() {
        for (i in _problems.indices) {
            println("Вывод: ${_problems[i].solve()}")
            println()
        }
    }
}