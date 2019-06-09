package engineer.dame.iterator.design_pattern

abstract class Aggregate[T] {
  def iterator(): Iterator[T]
}