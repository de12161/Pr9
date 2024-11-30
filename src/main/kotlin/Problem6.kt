internal object Problem6 : ISolution {
    override val name: String
        get() = "Задача 6"

    override fun solve(): String {
        val nums = intArrayOf(3, 2, 3)

        return nums.filter { num -> nums.count { it == num } > nums.size / 2 } .first().toString()
    }
}