package engineer.dame.iterator.design_pattern
class Book(name: String) {
  if (name == null) throw new Exception(s"Book class can't initialize with null")
  if (name.isEmpty) throw new Exception(s"Book class can't initialize with empty string")

  def getName(): String = {
    this.name
  }
}