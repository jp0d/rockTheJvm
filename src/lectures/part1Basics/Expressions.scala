package lectures.part1Basics

object Expressions extends App {

  val x = 1 + 2
  println(x)

  println(2 + 3 * 4)

  println(3 == x)

  var aVariable = 3
  aVariable += 3
  println(aVariable)

  // Instructions vs Expressions (Value or a type)

  val aCondtion = true

  val aConditionValue = if(aCondtion) 5 else 3

  println(aConditionValue)

  println(if(aCondtion) 5 else 3)

  var i = 0

  // Don't write while loops in Scala
  while(i<10) {
    println(i)
    i += 1
  }

  // NEVER WRITE THIS AGAIN ^

  // Everything in Scala is an expression

  val aWeirdVal = (aVariable = 3) // Unit is equivalent to Void
  println(aWeirdVal)

  val aCodeBlock = {
    val y = 2
    val z = y + 1
    if(z < 2) "hello" else "Fuck off"
  }

  println(aCodeBlock)

  val someValue = {
    2 < 3
  }

  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }

  println(someValue)
  println(someOtherValue)

}
