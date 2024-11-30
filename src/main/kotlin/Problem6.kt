internal class Problem6(private val _nums: IntArray) : IProblem {
    override val name: String
        get() = "Задача 6"

    override fun solve(): String {
        return _nums.first { num -> _nums.count { it == num } > _nums.size / 2 } .toString()
    }
}