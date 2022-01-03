fun main() {
	val inputChildrenCount: Int? = null

	val childrenCount = inputChildrenCount ?: 0

	val rectangle1 = RectangleFigure(4, 5)
	val rectangle2: RectangleFigure? = null

	rectangle1.printArea()
	rectangle1!!.printArea() // даже если null выполняется
	if (rectangle2 != null)
		rectangle2.printArea()
	else
		println("rectangle is null")
	rectangle2?.printArea()
}

class RectangleFigure(val a: Int, val b: Int)
{
	fun printArea()
	{
		val result = a * b
		println(result)
	}
}