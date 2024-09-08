    fun main() {
        val square = Square("Square")
        val circle = Circle("Circle")
        val triangle = Triangle("Triangle")
        val eqTriangle = EquilateralTriangle("Equilateral Triangle")

        println("Enter dimensions for Square (length and height):")
        square.setDimensions(readLine()!!.toDouble(), readLine()!!.toDouble())

        println("Enter dimensions for Circle (radius):")
        circle.setDimensions(readLine()!!.toDouble())

        println("Enter dimensions for Triangle (3 sides):")
        triangle.setDimensions(readLine()!!.toDouble(), readLine()!!.toDouble(), readLine()!!.toDouble())

        println("Enter dimensions for Equilateral Triangle (side):")
        eqTriangle.setDimensions(readLine()!!.toDouble())

        val shapes = listOf(square, circle, triangle, eqTriangle)

        println("\nShape Details:")
        for (shape in shapes) {
            println("\nName: ${shape.name}")
            shape.printDimensions()
            println("Area: ${shape.getArea()}")
        }
    }
