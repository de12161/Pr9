internal object Problem2 : ISolution {
    override val name: String
        get() = "Задача 2"

    override fun solve(): String {
        val nums1 = intArrayOf(1, 2, 2, 1)
        val nums2 = intArrayOf(2, 2)

        return nums1.filter { nums2.contains(it) }.associateWith { 0 }.keys.toString()
    }
}
