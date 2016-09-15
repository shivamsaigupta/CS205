

object Q6 {
  
  def main(args: Array[String]){
    
    var newList : List[Int] = List();
    var sortedList : List[Int] = List();
    var executeOnce = true;
    var inList : List[Int] = List();
    
    //Takes a list and num and puts the num in a position in the list such that all the elements 
    // in the left are less than num and all the elements to the right are greater than num
      def pivotSort (inputList: List[Int], num : Int) :List[Int] = {
       if(executeOnce){ //executes once
        newList = newList :+ num; //adds num to the empty new list
        executeOnce = false;
       }
       
        
       if (inputList.isEmpty){ //If the inputList is empty that means the job is done and hence we return the newList
         return newList;
       }else if(inputList.head < num) { //If the first element of the list is less than num then put the first element before the newList (num)
         newList = inputList.head::newList;
         pivotSort(inputList.tail,num); //Recurse over the function using the tail of the list
       } else if (inputList.head > num) { //If the first element of the old list is greater than the num then put the first element after the newList (num)
         newList = newList :+ inputList.head; 
         pivotSort(inputList.tail,num); //Recurse over the function using the tail of the list
       }
       return newList 
      }
      
      def SortPivot(inputList : List[Int]) : List[Int] = {
        inList = inputList;
        if(inList.tail.isEmpty){
          return sortedList;
        }else{
          var num : Int = inList.head;
          val partiallySorted : List[Int] = pivotSort(inList.tail, num);
          inList = inputList.tail;
          SortPivot(partiallySorted);
          
        }
      }
      
      //Test statement
      print(SortPivot( List(3,8,50,4)));
  }
}