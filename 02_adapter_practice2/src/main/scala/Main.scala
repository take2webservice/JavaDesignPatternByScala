package engineer.dame.adapter.design_pattern

import java.io._

object Main {
  def main(args: Array[String]) {
    try {
      val f: FileIO = new FileProperties()
      f.readFromFile("file.txt")
      f.setValue("year", "2004")
      f.setValue("month", "4")
      f.setValue("day", "21")
      f.writeToFile("newfile.txt")
    } catch {
      case e: IOException => e.printStackTrace()
      case _: Throwable   => println("unexpected_error")
    }
  }
}
