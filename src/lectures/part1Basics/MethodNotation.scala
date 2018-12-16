package lectures.part1Basics

object MethodNotation extends App {

  class Person (val name:String, favouriteMovie:String){
    def likes(movie: String):Boolean = movie == favouriteMovie

    def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"

    def unary_! : String = s"${name}, What the hell!!"

    def isAlive : Boolean = true

    def apply() : String = s"Hi, my name is $name and I like $favouriteMovie"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))

  println(mary likes "Inception")
  // Equivalent to above -> infix notation -> only works with single parameter methods
  // Inflx notation is also called syntactic sugar

  val tom = new Person("Tom", "Fight Club")
  println(mary hangOutWith tom)
  println(mary + tom)
  println(mary.+(tom))

  println(1 + 2)
  println(1.+(2))

  // All operators are methods

  //Prefix notation -> Unary operators -> work with only + - ~ !
  val x = -1 // is equivalent to 1.unary_-
  val y = 1.unary_-

  println(!mary)
  println(mary.unary_!)

  // POstfix notation -> only possible with methods without parameters
  println(mary.isAlive)
  println(mary isAlive)

  //Apply method
  println(mary.apply())
  println(mary()) // Equivalent to above

  /* Exercies
  *
  * 1. overload the + operator -> mary + "the rockstar" => new Person(Mary the rockstar)
  *
  * 2. Add an age to the Person class
  * Add a unary + operator => new person with the age + 1
  * +mary => mary with the age incrementer
  *
  * 3. Add a "learns" method in the Person class => "Mary learns scala"
  * Add a learnScala method, call method with "Scala"
  * Use it postfix notation
  *
  * 4. Overload the apply method
  * mary.apply(2) => "Mary watched Inception 2 times"
  *
  * */

  

}
