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
    def loop (chars: List[Char], balanced: Int): Boolean = {
      val head = if(chars.isEmpty) "" else chars.head
      val tail = if(chars.isEmpty) "".toList else chars.tail
      
      if(balanced < 0 || chars.isEmpty) balanced == 0
      else if(head == '(')
        loop(tail, balanced + 1)
      else if(head == ')')
        loop(tail, balanced - 1)
      else loop(tail, balanced)
    }
      
    loop(chars, 0)
        
  }
}