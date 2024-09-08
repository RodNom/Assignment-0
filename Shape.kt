interface Dimensionable {
    fun printDimensions()
}

abstract class Shape(_name: String) : Dimensionable {
    var name = _name

    open fun getArea(): Double {
        return 0.0
    }

    abstract fun setDimensions(vararg dimensions: Double)
}

class Square(_name: String) : Shape(_name) {
    private var length: Double = 0.0
    private var height: Double = 0.0

    override fun setDimensions(vararg dimensions: Double) {
        if (dimensions.size == 2) {
            length = dimensions[0]
            height = dimensions[1]
        }
    }

    override fun printDimensions() {
        println("Length: $length, Height: $height")
    }

    override fun getArea(): Double {
        return length * height
    }
}

class Circle(_name: String) : Shape(_name) {
    private var radius: Double = 0.0

    override fun setDimensions(vararg dimensions: Double) {
        if (dimensions.size == 1) {
            radius = dimensions[0]
        }
    }

    override fun printDimensions() {
        println("Radius: $radius")
    }

    override fun getArea(): Double {
        return Math.PI * radius * radius
    }
}

open class Triangle(_name: String) : Shape(_name) {
    private var sideA: Double = 0.0
    private var sideB: Double = 0.0
    private var sideC: Double = 0.0

    override fun setDimensions(vararg dimensions: Double) {
        if (dimensions.size == 3) {
            sideA = dimensions[0]
            sideB = dimensions[1]
            sideC = dimensions[2]
        }
    }

    override fun printDimensions() {
        println("Side A: $sideA, Side B: $sideB, Side C: $sideC")
    }

    override fun getArea(): Double {
        val s = (sideA + sideB + sideC) / 2
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC))
    }
}

class EquilateralTriangle(_name: String) : Triangle(_name) {
    private var side: Double = 0.0

    override fun setDimensions(vararg dimensions: Double) {
        if (dimensions.size == 1) {
            side = dimensions[0]
        }
    }

    override fun printDimensions() {
        println("Side: $side")
    }

    override fun getArea(): Double {
        val s = (3 * side) / 2
        return Math.sqrt(s * (s - side) * (s - side) * (s - side))
    }
}
