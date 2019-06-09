package engineer.dame.singleton.design_pattern.idcard
// 自身とコンパニオンからだけアクセスできるようにする定義方法
// class ClassName private(args...)
class CompanionSingleton private (var counter: Int) {
  println("CompanionSingletonインスタンスを生成しました。")
  def countUp(): Unit = { counter = counter + 1 }
  def currentCount(): Int = counter
}

object CompanionSingleton {
  val singleton: CompanionSingleton = apply()
  def apply(): CompanionSingleton = new CompanionSingleton(0)
  def getInstance: CompanionSingleton = singleton
}