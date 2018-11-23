package lectures.part1Basics

object StringOps extends App {

  val str: String = "Hello, I'm learning Scala"

  //Java functions
  println(str.charAt(2))
  println(str.substring(7,11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "-"))
  println(str.toLowerCase())
  println(str.length)

  //Scala functions
  val aNumberString = "45"
  val aNumber = aNumberString.toInt

  println('a' +: aNumberString :+ 'z')
  println(str.reverse)
  println(str.take(2))

  //Scala-specific: String interpolator

  //S-interpolators
  val name = "David"
  val age = 12
  val greeting = s"Hello, my name is $name and I'm $age years old"
  println(greeting)

  val greeting2 = s"Hello, my name is $name and I'm ${age + 10} years old"
  println(greeting2)

  //F-interpolators
  val speed = 1.2f
  val myth = f"$name%s can eat $speed%2.2f burgers per minute"
  println(myth)

  //raw-interpolator
  println(raw"This is a \n newline!")
  val escaped = "This is a \n newline!"
  println(raw"$escaped")

}
