package mastermind

import java.util.Scanner

import scala.util.matching.Regex

class MasterMind {

  def returnCode(): String = {
    println("give your  4 letter code using A-F")
    val code = new Scanner(System.in).nextLine()
    if (isCodeCorrect(code)) code
    else {
      println(s"$code isn't correct, try again")
      returnCode()
    }
  }

  def isCodeCorrect(str: String):Boolean = {
    val regex = new Regex("[A-F]{4}")
    regex.matches(str)
  }


}
