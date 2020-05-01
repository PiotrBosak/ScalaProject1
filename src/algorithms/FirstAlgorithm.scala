package algorithms

import scala.util.Random

class FirstAlgorithm extends GuessAlgorithm {
  private val random = new Random(System.nanoTime())

  private def createFirstGuess(): String = {
    val capitalA = 65
    val capitalF = 70
    val range = capitalF  - capitalA
    @scala.annotation.tailrec
    def aux(acc:String): String =
      if(acc.length == 4) acc
      else aux(acc + (random.nextInt(range)+capitalA).toChar)
    aux("")
  }
  private def updatedMap(guess: String, response:String): Map[String, String] = guesses + (guess -> response)

  def guess(): String = {
    if(guesses.isEmpty) createFirstGuess()
    else guessBasedOnResponses()
  }

  private def guessBasedOnResponses(): String = {
    ""// don't have an idea for an algorithm tbh
  }



}
