package engineer.dame.adapter.design_pattern

import java.util.Properties
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.InputStream
import java.io.IOException

class FileProperties extends Properties with FileIO {

  def readFromFile(filename: String): Unit = {
    load(new FileInputStream(filename))
  }

  def setValue(key: String, value: String): Unit = {
    setProperty(key, value)
  }

  def getValue(key: String): String = {
    getProperty(key)
  }

  def writeToFile(filename: String): Unit = {
    store(new FileOutputStream(filename), "written by FileProperties")
  }
}