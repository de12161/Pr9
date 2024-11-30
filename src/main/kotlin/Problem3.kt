internal object Problem3 : ISolution {
    override val name: String
        get() = "Problem 3"

    override fun solve(): String {
        val nums = intArrayOf(2, 7, 11, 15)
        val target = 9

        val ans = nums.associateWith { target - it } .filterValues { nums.contains(it) }

        return "[${nums.indexOf(ans.keys.first())}, ${nums.indexOf(ans.values.first())}]"
    }
}
