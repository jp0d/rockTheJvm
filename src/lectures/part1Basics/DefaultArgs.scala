package lectures.part1Basics

object DefaultArgs extends App {

  def trFact(n: Int, acc: BigInt = 1): BigInt = {
    if (n <= 1) acc
    else  trFact(n-1, n * acc)
  }

  val fact10 = trFact(10, 1)
  println(fact10)

  val fact11 = trFact(11)
  println(fact11)

  def savePicture (format: String = "jpg", width: Int = 1920, height: Int = 1080) : Unit = println("Saving pictures")

  savePicture("jpg", 800, 600)
  //savePicture( 800, 600) // results in error
  savePicture(width = 800)


}
