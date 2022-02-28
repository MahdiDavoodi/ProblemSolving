class Triangle(x: Double, y: Double, z: Double) {
    constructor(vararg n: Number) : this(n[0].toDouble(), n[1].toDouble(), n[2].toDouble())

    init {
        if (x + y < z || x + z < y || y + z < x || x <= 0 || y <= 0 || z <= 0) throw IllegalArgumentException()
    }

    val isEquilateral = x == y && y == z ; val isIsosceles = x == y || y == z || z == x ; val isScalene = x != y && y != z && x != z
}

/**
 * Iteration 1 - My way
 * A simple check and comparison.
 * */