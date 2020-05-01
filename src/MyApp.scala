import algorithms.FirstAlgorithm
import formatters.MessageFormatter
import mastermind.MasterMind

object MyApp extends App {
  val formatter = new MessageFormatter
  //val code = formatter.returnCode()
  //print(code)
  val algorithm = new FirstAlgorithm
  print(algorithm.createFirstGuess())

}
