package engineer.dame.design_pattern.builder

class TextBuilder extends Builder {
    var buffer: String = ""
    def buildTitle(title: String): Unit = {
        buffer += "======================\n"
        buffer += s"『${title}』\n"
        buffer += "\n"

    }
    def buildString(str: String): Unit = {
        buffer += s"■${str}\n"
        buffer += "\n"
    }
    def buildItems(items: Array[String]): Unit = {
        items.foreach(item => buffer += s"  ・${item}\n")
        buffer += "\n"
    }
    def buildDone(): Unit = {
        buffer += "======================\n"
    }

    def getResult(): String = buffer
}