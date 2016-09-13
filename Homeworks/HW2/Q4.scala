

object Q4 {
  
  //val sortInsert = new Q3;
  
  def main(args: Array[String]){
    val myList : List[Int] = List(3,6,8,10); //Example List
    var headList : List[Int] = List(); //Accumulator
    var sortedList : List[Int] = List(); //Empty sorted list which the recursive function will append to
    
    def sortInsert(inputList: List[Int], needle: Int) :List[Int] = {
      
        
      if(inputList.isEmpty){
        val outputList : List[Int] = List(needle);
        return outputList;
        }
      else if(inputList.head > needle){
        val needleList : List[Int] = List(needle);
        val outputList : List[Int] = List.concat(headList, needleList, inputList);
        return outputList;
        }
      else if(inputList.last < needle) {
        val needleList : List[Int] = List(needle);
        val outputList : List[Int] = List.concat(inputList, needleList);
        return outputList;
      }
      else {
        //append head to headList
        headList = headList :+ inputList.head;
        //println(newHeadList);
        sortInsert(inputList.tail, needle);
        
        }
      }

    def InsertionSort(unsortedList: List[Int]) : List[Int] = {
      
      if(unsortedList.isEmpty){
        return sortedList;
      } else {
        
        sortedList = sortInsert(sortedList, unsortedList.head);
        headList=Nil; //To avoid the function sortInsert to append new values to the old headList, we reset it
        InsertionSort(unsortedList.tail);
      
      }
    }
      
      val myUnsortedList : List[Int] = List(5,2,4,6,1,3); //Example List
      //Test Print
      print(InsertionSort(myUnsortedList));
    
  }
}