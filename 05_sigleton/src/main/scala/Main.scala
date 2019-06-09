package engineer.dame.singleton.design_pattern.idcard
object Main {
  def main(args: Array[String]) {
    val os = ObjectSingleton
    os.countUp()
    println(os.currentCount())

    val cs: CompanionSingleton = CompanionSingleton.getInstance
    cs.countUp()
    println(cs.currentCount())
  }
}