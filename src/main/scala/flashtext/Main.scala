package flashtext

object Main extends App {

  val keywordProcessor = KeywordProcessor()
  keywordProcessor.addKeyWord("word", "sentence")
  keywordProcessor.addKeyWord("wrong", "correct")

  val replaceResult = keywordProcessor.replaceKeyWords("This word is wrong")
  println(replaceResult)
}