

object Q7 {
  
  var result : Int = 1;
  
    def main(args: Array[String]): Unit={
                
  }
  
  //Takes x as the base number and n as the exponent. Recursively calculates x^n by using Fast Power algorithm
    def fastPower(x: Int, n: Int): Int={
     var nBkp = n
     var xBkp = x
      if(nBkp%2!=0)
        return xBkp*fastPower(xBkp,nBkp-1)
      if(nBkp==0) 
        return 1
      else
        {result=fastPower(xBkp,nBkp/2)
        return result*result}
      
      }
    
    println(fastPower(2,6));
}
    