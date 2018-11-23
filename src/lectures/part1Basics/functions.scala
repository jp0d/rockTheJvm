package lectures.part1Basics

object functions extends App {
  def aFunction(a: String, b: Int): String = a + " " + b

  /*
  // Test unit method
  def unitFun(x: Unit, y:Unit):Unit = {
    x + y
  }

  println(unitFun(3, 4))

  */

  println(aFunction("ALKJSF", 523))

  def aParamLessFunction(): Int = 42

  println(aParamLessFunction())
  println(aParamLessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if(n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction("AKJSD", 3))

  def aFunctionWithSideEffect(aString: String) : Unit = println(aString)

  aFunctionWithSideEffect(aRepeatedFunction("HOLA",5))

  def aBigFunction(n: Int): Int = {
    def aSmallerFuntion(a: Int, b:Int) : Int = a + b

    aSmallerFuntion(n, n-1)
  }

  println(aBigFunction(10))

  /*
  1. Print shit function
  2. Factorial function
  3. FIbonacci function = {f(n) = f(n-1) + f(n - 2)}
  4. Test if a number is prime
   */

  // Function 1 : Print shit

  def greetingsForKids(name: String, age: Int) : String = {
    "Hi, my name is shithead " + name + " and I'm " + age + " fucking year old!"
  }

  println(greetingsForKids("Gandu", 20))

  // Function 2 : Factorial function

  def factorial(num: Int): Int =
    if (num <= 1) 1
    else num * factorial(num - 1)

  println(factorial(5))

  // Function 3 : Finomacci

  def fibonacci(n : Int) : Int = {
    if (n <= 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
  }

  println(fibonacci(10)) // 1 1 2 3 5 8 13 21 34 55

  // Function 4 : Primer number test

  def isPrime(n : Int) : Boolean = {
    def isPrimeUntil(t: Int) : Boolean = {
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)
    }

    isPrimeUntil(n/2)
  }

  println(isPrime(100))
  println(isPrime(2003))
  println(isPrime(43 * 13))

}
