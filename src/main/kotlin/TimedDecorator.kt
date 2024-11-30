internal class TimedDecorator(private val wrappee: ISolution) : ISolution {
    override val name: String
        get() = wrappee.name

    override fun solve(): String {
        println(wrappee.name)

        wrappee.solve()

        val start = System.nanoTime()
        val result = wrappee.solve()
        val end = System.nanoTime()

        println("Время выполнения: ${end - start} нс")

        return result
    }
}
