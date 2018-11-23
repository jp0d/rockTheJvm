package lectures.part1Basics

import java.util.concurrent.atomic.DoubleAccumulator

import scala.annotation.tailrec

object Recursion extends App {

  var result1:Int = 0

  def factorialTest(num: Int): Int = {
    if (num <= 1) 1
    else {
      println("Computing factorial of " + num + " First I need factorial of " + (num - 1))
      println("Result : " + result1)
      result1 = num * factorial(num - 1)
      println("Result : " + result1)
      println("Computed factorial of " + num)
      result1
    }
  }

  def factorial(num: Int): Int = {
    if (num <= 1) 1
    else {
      println("Computing factorial of " + num + " First I need factorial of " + (num - 1))
      val result = num * factorial(num - 1)
      println("Computed factorial of " + num)
      result
    }
  }

  println(factorial(5))

  def anotherFactorial(num: BigInt): BigInt = {
    @tailrec
    def factHelper(x: BigInt, accumulator: BigInt) : BigInt = {
      if (x <= 1) accumulator
      else {
        factHelper(x - 1, x * accumulator)
      }
    }

    factHelper(num, 1)
  }

  println(anotherFactorial(9))

  // Exercises

  // Concatenate a string n times

  @tailrec
  def concatenateTailrec(aString: String, n: Int, accumulator: String): String = {
    if (n <= 0) accumulator
    else concatenateTailrec(aString, n-1, aString + accumulator)
  }

  println(concatenateTailrec(aString = "XXX", n = 5, accumulator = ""))

  // IsPrime function tail recursive
  def isPrime(n: Int):Boolean = {
    @tailrec
    def isPrimeTailred(t: Int, isStillPrime: Boolean):Boolean = {
      if (!isStillPrime) false
      else if (t <=1 ) true
      else isPrimeTailred(t - 1, n % t != 0 && isStillPrime)
    }
    isPrimeTailred(n/2, true)
  }

  println(isPrime(2003))
  println(isPrime(629))

  def fibonacci(n:Int): Int = {
    def fiboTailrec(i: Int, last: Int, nextToLast: Int): Int = {
      if (i >= n) last
      else fiboTailrec(i + 1, last + nextToLast, last)
    }

    if ( n <= 2 ) 1
    else fiboTailrec(2, 1, 1)
  }

  println(fibonacci(8))
}
