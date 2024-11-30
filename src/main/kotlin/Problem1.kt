internal object Problem1 : ISolution {
    override val name: String
        get() = "Задача 1"

    override fun solve(): String {
        val nums1: Iterable<Int> = arrayListOf(1, 2, 2, 1)
        val nums2: Iterable<Int> = arrayListOf(2, 2)

        return nums1.intersect(nums2.toSet()).toString()
    }
}
