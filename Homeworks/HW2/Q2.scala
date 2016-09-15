

object Q2 {
  
  def main(args: Array[String]){
    
    var list1 : List[Int] = List();
    var list2 : List[Int] = List();
    
    def Split(inputList:List[Int]):(List[Int],List[Int]) = {
      //Base Case
      if(inputList.isEmpty){
        return (list1,list2.reverse); //return list 1, return list 2's reverse because we added the last element first
      } else if (inputList.head == inputList.last){
        list1 = list1 :+ inputList.head;
        return (list1,list2.reverse); 
      }else{
        //Recursive Case
        list1 = list1 :+ inputList.head; //Add first element to list 1
        list2 = list2 :+ inputList.last; //Add last element to list 2
        Split(inputList.init.tail); //Pass the middle part of the list as the argument as the recursive call
      }
      
    }
    
    //Test Statement
    
    println(Split(List(2,3,8,4,6)));
  }
}
