class Q2 {
  def main (args: Array[String]):Unit = {
    
    println(split(List(1,2,3,4)));
    
  }
  
  def split(list : List[Int]) : (List[Int], List[Int]) = {
    var list1 : List[Int] = List();
    var list2 : List[Int] = List();
    var listo : List[Int] = list;
    
    while(!(listo.isEmpty)){
      list1 = list1 :+ (list.head)
      listo = listo.drop(1)
      
      if(!listo.isEmpty){
        list2 = listo.last :: list2
        listo = listo.init
      }
      
      
    }
    
    (list1,list2)
    
    
    
  }
}