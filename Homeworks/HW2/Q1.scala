

object Q1 {
  
  def main(args: Array[String]){
   
    //Factorial Recursive Function: Takes n and returns n!
    def fact(n: Int): Int = {
      //Base Case: 
      if(n==1){
        return n;
      }
      //Recursive Part:
      else {
       fact(n-1)*n; 
      }
    }
    //Test Print
    print(fact(4));
  }
}