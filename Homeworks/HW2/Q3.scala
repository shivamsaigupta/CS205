

object Q3 {
  
  def main(args: Array[String]){
   
    val myList : List[Int] = List(2,3,4,8,10); //Example list to test
    var headList : List[Int] = List(); //Accumulator

    //sortInsert Recursive Function takes 
    def sortInsert(inputList: List[Int], num: Int) :List[Int] = {
      
        //Base Case:
      if(inputList.isEmpty){
        val outputList : List[Int] = List(num);
        return outputList;
        }
      else if(inputList.head > num){
        val numList : List[Int] = List(num); //Converts numList into list so that it can be concatenated
        val outputList : List[Int] = List.concat(headList, numList, inputList); //Concatenate the first part (the accumulated headList), the number and the tail
        return outputList;
        }
      else if(inputList.last < num) {
        val numList : List[Int] = List(num);
        val outputList : List[Int] = List.concat(inputList, numList);
        return outputList;
      }
      //Recursive Part:
      else {
        //append head to headList
        headList = headList :+ inputList.head;
        sortInsert(inputList.tail, num);
        
        }
      }
    //Test print
    println(sortInsert(myList,9));
  }
}
