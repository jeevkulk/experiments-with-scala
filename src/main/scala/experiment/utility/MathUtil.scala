package experiment.utility

object MathUtil {
    def main(args : Array[String]): Unit = {
        println(new MathUtil().gcd(42, 24))
    }
}

class MathUtil {

    def gcd(a : Int, b : Int) : Int = {
        if (b == 0) a else gcd (b, a % b)
    }
}
