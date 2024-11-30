internal object Problem4 : ISolution {
    override val name: String
        get() = "Задача 4"

    override fun solve(): String {
        val nums = intArrayOf(8, 1, 2, 2, 3)

        var i = 0
        return nums.associate { num -> Pair(i++, nums.count { it < num }) }.values.toString()
    }
}