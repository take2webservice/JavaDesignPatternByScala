package engineer.dame.singleton.design_pattern.idcard

object ObjectSingleton {
  var counter = 0
  println("ObjectSingletonインスタンスを生成しました。")
  def countUp(): Unit = { counter = counter + 1 }
  def currentCount(): Int = counter
}