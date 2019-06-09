package engineer.dame.adapter.design_pattern
class PrintBanner(string: String) extends Print {
  val banner: Banner = new Banner(string)
  def printWeak(): Unit = banner.showWithParren()
  def printStrong(): Unit = banner.showWithAster()
}