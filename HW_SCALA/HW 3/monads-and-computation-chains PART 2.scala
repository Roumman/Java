object FoodOrderService {

  // Модели данных
  case class User(id: Int, name: String, email: String)
  case class Order(id: Int, userId: Int, amount: Double, status: String)

  // База данных пользователей (имитация)
  private val users = Map(
    1 -> User(1, "Иван Петров", "ivan@email.com"),
    2 -> User(2, "Мария Сидорова", "maria@email.com"),
    3 -> User(3, "Петр Иванов", "petr@email.com")
  )

  // База данных заказов (имитация)
  private val orders = Map(
    101 -> Order(101, 1, 1200.50, "active"),
    102 -> Order(102, 1, 300.00, "completed"),
    103 -> Order(103, 2, 450.00, "active"),
    104 -> Order(104, 3, 2000.00, "active")
  )

  // 1. Поиск пользователя по ID
  private def findUser(id: Int): Option[User] = users.get(id)

  // 2. Поиск активного заказа пользователя
  private def getActiveOrder(user: User): Option[Order] =
    orders.values.find(order => order.userId == user.id && order.status == "active")

  // 3. Расчёт скидки на основе суммы заказа
  private def calculateDiscount(order: Order): Either[String, Double] = {
    if (order.amount >= 500) {
      // Скидка 10% от суммы заказа
      Right(order.amount * 0.1)
    } else {
      Left(s"Слишком маленькая сумма для скидки: ${order.amount} (минимум 500)")
    }
  }

  // 4. Функция, связывающая все вызовы в цепочку с помощью for-comprehension
  def getUserDiscount(userId: Int): Either[String, Double] = {
    val result = for {
      user <- findUser(userId).toRight(s"Пользователь с ID $userId не найден")
      order <- getActiveOrder(user).toRight(s"У пользователя ${user.name} нет активных заказов")
      discount <- calculateDiscount(order)
    } yield discount

    result
  }

  def main(args: Array[String]): Unit = {
    println("=== ТЕСТИРОВАНИЕ СЕРВИСА ЗАКАЗА ЕДЫ ===\n")

    // Тест 1: Пользователь существует, есть активный заказ с большой суммой
    testUserDiscount(1)

    // Тест 2: Пользователь существует, есть активный заказ с маленькой суммой
    testUserDiscount(2)

    // Тест 3: Пользователь существует, нет активных заказов
    testUserDiscount(3)

    // Тест 4: Пользователь не существует
    testUserDiscount(99)
  }

  private def testUserDiscount(userId: Int): Unit = {
    println(s"Запрос скидки для пользователя ID: $userId")
    getUserDiscount(userId) match {
      case Right(discount) =>
        println(s"  ✓ Успешно: Скидка составляет ${"%.2f".format(discount)} руб.")
      case Left(error) =>
        println(s"  ✗ Ошибка: $error")
    }
    println()
  }
}
