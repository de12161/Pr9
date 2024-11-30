internal class Problem3(private val _nums: IntArray, private val _target: Int) : IProblem {
    override val name: String
        get() = "Задача 3"

    override fun solve(): String {
        val ans = _nums.associateWith { _target - it } .filterValues { _nums.contains(it) }
        return "[${_nums.indexOf(ans.keys.first())}, ${_nums.indexOf(ans.values.first())}]"
    }
}