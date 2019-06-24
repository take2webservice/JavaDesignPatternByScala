package engineer.dame.design_pattern.builder

abstract class Builder {
    var hasInitilaized = false
    def makeTitle(title: String) {
        if (!hasInitilaized) {
            buildTitle(title)
            hasInitilaized = true
        }
    }

    def makeString(str: String) {
        if (hasInitilaized) buildString(str)
    }

    def makeItems(items: Array[String]) {
        if (hasInitilaized) buildItems(items)
    }

    def close() {
        if (hasInitilaized) buildDone()
    }

    def buildTitle(title: String): Unit
    def buildString(str: String): Unit
    def buildItems(items: Array[String]): Unit
    def buildDone(): Unit
    def getResult(): String
}