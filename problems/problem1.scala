package problems

/*
 * Written by: Jose Carlos Carrasco Jimenez
 * Purpose: This is part of a series of problems found in project Euler. 
 * 			This is just the solution for problem #1 of the problems
 * 			found at http://projecteuler.net 
 */

object problem1 {

  def main(args: Array[String]) {
    println("Problem 1: " + sumMultiples(1000)) //Euler project: problem 1
  }
  /*
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
  def sumMultiples(max: Int): Int = {
    (1 until max).filter(n => n % 3 == 0 || n % 5 == 0).sum
  }

}