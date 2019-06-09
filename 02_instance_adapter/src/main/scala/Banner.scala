package engineer.dame.adapter.design_pattern
class Banner(string: String) {
  if (string == null || string.isEmpty()) throw new Exception("Banner must have non-empty String")

  def showWithParren() {
    println(createWithParren())
  }

  def createWithParren(): String = s"(${string})"

  def showWithAster() {
    println(createWithAster())
  }

  def createWithAster(): String = s"*${string}*"
}