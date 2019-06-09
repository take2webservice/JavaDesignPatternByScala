package engineer.dame.adapter.design_pattern

import java.io.IOException

abstract trait FileIO {
  @throws(classOf[IOException])
  def readFromFile(filename: String): Unit

  @throws(classOf[IOException])
  def writeToFile(filename: String): Unit

  def setValue(key: String, value: String): Unit

  def getValue(key: String): String
}