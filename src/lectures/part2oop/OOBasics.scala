package lectures.part2oop

object OOBasics extends App {
  //val person = new Person("John", 26)
  //println(person.greet("Daniel"))
  //println(person.greet())

  val author = new Writer("charles", surname = "Dickens", 1812)
  val imposter = new Writer("charles", surname = "Dickens", 1812)
  val novel = new Novel("Great Expectations", 1861, author)

  println(novel.authorAge)
  println(novel.isWrittenBy(author))
  println(novel.isWrittenBy(imposter))
}

//Constructor
class Person(name: String, age: Int) {
  // body defines the implementation of this class
  val x = 2
  //println(x + 5)
  println(this.name)

  def greet(name: String):Unit = {
    println(s" ${this.name} says: Piss off, $name")
    println(this.name + " says: Piss off, " + name)
  }

  def greet () : Unit = {
    println(s"Hi, I'm $name")
  }

  // multiple or overloading constructors

  def this(name: String) = this(name, 0)
  def this() = this("John Doe!")
}

//class parameters are not fields. They cannot be accessed unless declared as a var/val


class Writer (firstName: String, surname: String, val year: Int) {
  def fullName: String = firstName + " " + surname
}

class Novel (name: String, year: Int, author: Writer) {
  def authorAge = year - author.year
  def isWrittenBy (author: Writer) = author == this.author
  def copy (newYear: Int): Novel = new Novel(name, newYear, author)
}
