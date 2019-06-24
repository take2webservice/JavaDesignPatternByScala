package engineer.dame.design_pattern.builder

import java.io.PrintWriter
import java.io.FileWriter
import java.io.IOException

class HtmlBuilder extends Builder {
    private var filename: String = ""
    private var writer: PrintWriter = null

    def buildTitle(title: String): Unit = {
        filename = s"${title}.html"
        try {
            writer = new PrintWriter(new FileWriter(filename))
        } catch {
            case e: IOException => e.printStackTrace()
        }
        writer.println(s"<html><head><title>${title}</title></head><html>")
        writer.println(s"<h1>${title}</h1>")
    }
    def buildString(str: String): Unit = {
        writer.println(s"<p>${str}</p>")
    }
    def buildItems(items: Array[String]): Unit = {
        writer.println("<ul>")
        items.foreach(item => writer.println(s"<li>${item}</li>"))
        writer.println("</ul>")
    }
    def buildDone(): Unit = {
        writer.println(s"</body></html>")
        writer.close()
    }

    def getResult(): String = filename
}