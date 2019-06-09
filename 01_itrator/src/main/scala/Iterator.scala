package engineer.dame.iterator.design_pattern

abstract class Iterator[T] {
  def hasNext(): Boolean
  def next(): Option[T]
}