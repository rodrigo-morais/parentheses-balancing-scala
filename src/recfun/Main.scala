package recfun

object Main {
  def main(args: Array[String]) {
    println(isBalancing("()".toList))
    println(isBalancing("".toList))
    println(isBalancing("())(".toList))
    println(isBalancing("()(())(()())".toList))
  }
  
  def isBalancing(chars: List[Char]): String = {
    val sentence: String = (for(i <- chars) yield(i))(collection.breakOut)
    if(balance(chars)) "The string '" + sentence + "' is balanced."
    else "The string '" + sentence + "' is not balanced."
  }
  
  def balance(chars: List[Char]): Boolean = {
    false
  }
}