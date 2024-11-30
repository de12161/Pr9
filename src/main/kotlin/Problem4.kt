internal class Problem4(private val _nums: IntArray) : IProblem {
    override val name: String
        get() = "Задача 4"

    override fun solve(): String {
        var i = 0
        return _nums.associate { num -> Pair(i++, _nums.count { it < num }) }.values.toString()
    }
}