fun main() {
	val weekSales:MutableList<Int> = mutableListOf(45, 8, 848, 365, 57)
	weekSales.add(890)
	weekSales.remove(8)
	weekSales.removeAt(4)

	var counter = 0
	for (num in weekSales)
	{
		if (num > 200)
		{
			counter++
		}
		println(num)
	}

	println(counter)

}

fun some(list: List<Int>)
{

}