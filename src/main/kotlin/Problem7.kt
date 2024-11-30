internal class Problem7(private val _nums: IntArray) : IProblem {
    override val name: String
        get() = "Задача 7"

    override fun solve(): String {
        return _nums.any { num -> _nums.count { it == num } > 1 }.toString()
    }
}