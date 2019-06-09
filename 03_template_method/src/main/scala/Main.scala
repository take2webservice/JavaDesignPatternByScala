package engineer.dame.template_method.design_pattern
object Main {
  def main(args: Array[String]): Unit = {
    val d1: AbstractDisplay = new CharDisplay('H')
    val d2: AbstractDisplay = new StringDisplay("Hello, world.")
    val d3: AbstractDisplay = new StringDisplay("こんにちは。")
    d1.display()
    d2.display()
    d3.display()
  }
}