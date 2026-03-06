1) "LazyList и эффективные вычисления"

object FibonacciLazyList {

  // 1. Реализация бесконечного LazyList чисел Фибоначчи
  def fibonacci: LazyList[BigInt] = {
    def fib(a: BigInt, b: BigInt): LazyList[BigInt] = a #:: fib(b, a + b)

    fib(0, 1)
  }

  def main(args: Array[String]): Unit = {
    println("Первые 20 чисел Фибоначчи:")
    println(fibonacci.take(20).toList)

    // 2. Находим первые 10 чисел Фибоначчи, которые делятся на 3
    val divisibleBy3 = fibonacci.filter(_ % 3 == 0).take(10)

    // 3. Преобразуем результат в Vector для окончательного вычисления
    val resultVector = divisibleBy3.toVector

    println("\nПервые 10 чисел Фибоначчи, делящихся на 3:")
    println(resultVector)
  }
}

2) "LazyList и эффективные вычисления (дополнение)"

import FibonacciLazyList.fibonacci

object Main {
  def main(args: Array[String]): Unit = {
    // ЗАДАНИЕ 1
    // Вариант 1 с foldLeft
    /*def MySumFoldLeft(a: List[Int]): Int = {
      a.foldLeft(0)(_ + _)
    }

    println(MySumFoldLeft(List(-2, 5, 0)))*/

    // Вариант 2 Рекурсия
    /*def MySumRecurtion(a: List[Int]): Int = a match {
      case Nil => 0
      case head :: tail => head + MySumRecurtion(tail)
    }

    println(MySumRecurtion(List(-2, 5, 0)))
  }*/

    // ЗАДАНИЕ 2
    /*def MyRange(n: Int, m: Int): List[Int] = {
    if(n > m) Nil
    else {
      def build(current: Int, end: Int): List[Int] = current match {
        case x if x > end => Nil
        case x => x :: build(x + 1, end)
      }
      build(n, m)
    }
  }

  println(MyRange(1, 5))
  println(MyRange(3, 3))
  println(MyRange(5, 1))*/

    println("Первые 20 чисел Фибоначчи:")
    println(fibonacci.take(20).toList)

    // 2. Находим первые 10 чисел Фибоначчи, которые делятся на 3
    val divisibleBy3 = fibonacci.filter(_ % 3 == 0).take(10)

    // 3. Преобразуем результат в Vector для окончательного вычисления
    val resultVector = divisibleBy3.toVector

    println("\nПервые 10 чисел Фибоначчи, делящихся на 3:")
    println(resultVector)
  }
}
