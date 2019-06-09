package engineer.dame.template_method.design_pattern
abstract class AbstractDisplay {
  def open(): Unit
  def print(): Unit
  def close(): Unit
  final def display(): Unit = {
    open()
    for (_ <- 1 to 5) print()
    close()
  }
}