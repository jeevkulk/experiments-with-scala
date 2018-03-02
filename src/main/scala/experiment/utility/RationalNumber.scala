package experiment.utility

object RationalNumber {
    def main (args : Array[String]): Unit = {
        var a = new RationalNumber(5, 6)
        println(a add (5, 9))
    }
}

class RationalNumber(n : Int, d : Int) {
    require (d != 0)

    private var g = gcd (n, d)
    val numerator = n / g
    val denominator = d / g

    def this(n: Int) = this(n, 1)

    def add (n1 : Int, d1 : Int) : RationalNumber = {
        new RationalNumber (numerator * d1 + n1 * denominator, denominator * d1)
    }

    def + (n1 : Int, d1 : Int) : RationalNumber = {
        new RationalNumber (numerator * d1 + n1 * denominator, denominator * d1)
    }

    def gcd (n : Int, d : Int ) : Int = {
        if (d == 0) n else gcd (d, n % d)
    }

    override def toString: String = this.numerator + " / " + this.denominator
}
