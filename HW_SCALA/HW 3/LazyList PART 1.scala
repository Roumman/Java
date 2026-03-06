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
