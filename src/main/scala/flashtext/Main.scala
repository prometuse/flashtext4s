package flashtext

object Main extends App {

  val keywordProcessor = KeywordProcessor(true)
  keywordProcessor.addKeyWord("Word", "sentence")
  keywordProcessor.addKeyWord("wrong", "correct")
  val replaceResult = keywordProcessor.replaceKeywords("This word is wrong")
  println(replaceResult)
}
