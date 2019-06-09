package engineer.dame.adapter.design_pattern
class PrintBanner(string: String) extends Banner(string) with Print {
  def printWeak(): Unit = showWithParren()
  def printStrong(): Unit = showWithAster()
}