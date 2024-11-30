internal object Problem5 : ISolution {
    override val name: String
        get() = "Задача 5"

    override fun solve(): String {
        val nums = intArrayOf(3, 0, 1)

        val size = nums.size
        val sum = size * (size + 1) / 2

        return (sum - nums.sum()).toString()
    }
}