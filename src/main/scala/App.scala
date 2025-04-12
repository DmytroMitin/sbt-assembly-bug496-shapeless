import shapeless.HNil

object App {
  def main(args: Array[String]): Unit = {
    println(1 :: "a" :: HNil)
  }
}
