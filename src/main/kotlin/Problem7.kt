internal object Problem7 : ISolution {
    override val name: String
        get() = "Задача 7"

    override fun solve(): String {
        val nums = intArrayOf(1, 2, 3, 1)

        return nums.any { num -> nums.count { it == num } > 1 }.toString()
    }
}