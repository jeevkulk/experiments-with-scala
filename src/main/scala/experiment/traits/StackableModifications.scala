package experiment.traits

import scala.collection.mutable.ArrayBuffer

object StackableModifications {
    def main(args : Array[String]): Unit = {
        val queue1 = new BasicIntQueue
        queue1.put(10)
        queue1.put(100)
        println("*** BasicIntQueue ***")
        queue1.printArray()

        val queue2 = new BasicIntQueue with Doubling with Incrementing
        queue2.put(10)
        queue2.put(100)
        println("*** BasicIntQueue with Doubling with Incrementing ***")
        queue2.printArray()

        val queue3 = new BasicIntQueue with Filtering with Doubling with Incrementing
        queue3.put(-5)
        queue3.put(10)
        queue3.put(100)
        println("*** BasicIntQueue with Filtering with Doubling with Incrementing ***")
        queue3.printArray()
    }
}

abstract class IntQueue {
    def get(): Int
    def put(x: Int): Unit
}

class BasicIntQueue extends IntQueue {
    private val arrayBuffer = new ArrayBuffer[Int]

    override def get(): Int = arrayBuffer.remove(0)

    override def put(x: Int): Unit = arrayBuffer.+=(x)

    def printArray() : Unit = {
        arrayBuffer.foreach(println(_))
    }
}


trait Doubling extends IntQueue {
    abstract override def put(x: Int): Unit = { super.put(2 * x) }
}

trait Incrementing extends IntQueue {
    abstract override def put(x: Int): Unit = { super.put(x + 1) }
}

trait Filtering extends IntQueue {
    abstract override def put(x: Int): Unit = {
        if (x > 0) super.put(x)
    }
}
