import mastermind.MasterMind

object MyApp extends App {
  val mastermind = new MasterMind
  val code = mastermind.returnCode()
  print(code)

}
