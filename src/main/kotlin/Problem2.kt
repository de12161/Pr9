internal class Problem2(private val _nums1: IntArray, private val _nums2: IntArray) : IProblem {
    override val name: String
        get() = "Задача 2"

    override fun solve(): String {
        return _nums1.filter { _nums2.contains(it) }.associateWith { 0 }.keys.toString()
    }
}