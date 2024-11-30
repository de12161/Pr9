internal class TimedDecorator(private val wrappee: ISolution) : ISolution {
    override val name: String
        get() = wrappee.name

    override fun solve(): String {
        println(wrappee.name)

        val start = System.currentTimeMillis()
        val result = wrappee.solve()
        val end = System.currentTimeMillis()

        println("Время выполнения: ${end - start} мс")

        return result
    }
}
