internal class Problem5(private val _nums: IntArray) : IProblem {
    override val name: String
        get() = "Задача 5"

    override fun solve(): String {
        val size = _nums.size
        val sum = size * (size + 1) / 2
        return (sum - _nums.sum()).toString()
    }
}