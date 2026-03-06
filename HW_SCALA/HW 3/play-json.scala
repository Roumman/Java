import play.api.libs.json.*
import play.api.libs.functional.syntax.*

case class Product(id: Long, name: String, price: Double, tags: List[String])

object ProductJson {
  given productFormat: Format[Product] = (
    (__ \ "id").format[Long] and
      (__ \ "name").format[String] and
      (__ \ "price").format[Double] and
      (__ \ "tags").format[List[String]]
    )(Product.apply, p => Tuple.fromProductTyped(p))

  def main(args: Array[String]): Unit = {
    val jsonStr = """{"id": 1, "name": "Laptop", "price": 999.99, "tags": ["tech", "work"]}"""

    // Десериализация
    val json = Json.parse(jsonStr)
    val product = json.as[Product]
    println(s"Десериализовано: $product")

    // Сериализация
    val jsonOut = Json.toJson(product)
    println(s"Сериализовано: $jsonOut")
  }
}
