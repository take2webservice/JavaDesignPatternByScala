package engineer.dame.design_pattern.builder

object Main {
    def main(args: Array[String]) {
        if (args.length != 1) {
            usage()
            return
        }
        args(0) match {
            case "plain" => {
                val textBuilder: Builder = new TextBuilder()
                val director :Director = new Director(textBuilder)
                director.construct()
                val result = textBuilder.getResult()
                println(result)
            }
            case "html" => {
                val htmlBuilder: Builder = new HtmlBuilder()
                val director :Director = new Director(htmlBuilder)
                director.construct()
                val filename = htmlBuilder.getResult()
                println(s"${filename}が作成されました。")
            }
            case _ => {
                usage()
            } 
        }
    }

    def usage() {
        println("Usage: sbt run plain プレーンテキストで文書作成")
        println("Usage: sbt run html HTMLファイルで文書作成")
    }
}