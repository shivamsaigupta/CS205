class Queue[T] {
  
	var lst: List[Any]=Nil
	
	def equals(that: Queue[T]): Boolean={
		(this.lst, that.lst) match{
		  case _ => false	
		  case (Nil, Nil) => true
			case (hd1::rest1, hd2::rest2) => (hd1.equals(hd2)) && (rest1.equals(rest2))
			
		}
	}
	override def hashCode(): Int={
		var sum: Int=0
		this.lst.foreach{
			sum+=_.hashCode()
		}
		sum
	}
	def Enqueue(x: Any): Unit={
		lst = x :: lst
		print(lst)
	}
	def Dequeue(): Unit={
		lst match{
			case Nil => lst=Nil
			case _ => lst=lst.init
		}
		println(lst)
	}
}

object Q1{
  def main(args:Array[String]):Unit = {
    var a = new Queue()
    a.enqueue(5);
  }
}
