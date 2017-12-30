package experiment.utility

/**
  * Defining an object makes it singleton. Scala does not have static as a keyword,
  * but all methods in object can be called directly with class reference.
  */
object Utility {
    /**
      * Only object can have main method with can be called as a main program.
      * This program takes arguments and prints them in two ways:
      * 1. In foreach loop, and
      * 2. Using mkString, which delimits the collection using the delimiter passed.
      * @param args
      */
    def main(args : Array[String]) = {
        args.map(_.toUpperCase).foreach(printf("%s ", _))
        println("")

        val output = args.map(_.toUpperCase).mkString("-")
        println(output)
    }
}
