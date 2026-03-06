object TypeclassValidator {

  // 1. Определение тайпкласса Validator
  trait Validator[T] {
    def validate(value: T): Boolean
  }

  // 2. Объект-компаньон с неявными экземплярами для стандартных типов
  object Validator {
    // Неявный экземпляр для String
    implicit val stringValidator: Validator[String] = new Validator[String] {
      def validate(value: String): Boolean = value != null && value.trim.nonEmpty
    }

    // Неявный экземпляр для Int
