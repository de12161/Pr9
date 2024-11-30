internal object Problem2 : ISolution {
    override val name: String
        get() = "Задача 2"

    private fun intersection(l1: IntArray, l2: IntArray): Set<Int> {
        val ret = mutableSetOf<Int>()
        l1.forEach { if (l2.contains(it)) ret.add(it) }
        return ret
    }

    override fun solve(): String {
        val nums1 = intArrayOf(1, 2, 2, 1)
        val nums2 = intArrayOf(2, 2)

        return intersection(nums1, nums2).toString()
    }
}
