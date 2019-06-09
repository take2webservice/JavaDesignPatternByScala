package engineer.dame.adapter.design_pattern
object Main {
  def main(args: Array[String]) {
    val banner: Print = new PrintBanner("Hello")
    banner.printWeak()
    banner.printStrong()
  }
}
