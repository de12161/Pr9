internal class Problem1(private val _nums1: IntArray, private val _nums2: IntArray) : IProblem {
    override val name: String
        get() = "Задача 1"

    override fun solve(): String {
        return _nums1.intersect(_nums2.toSet()).toString()
    }
}