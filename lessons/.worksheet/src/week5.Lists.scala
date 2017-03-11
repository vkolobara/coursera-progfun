package week5

object Lists {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(190); 
  
def init[T](xs: List[T]): List[T] = xs match {
	case List() => throw new Error("Init of empty list")
	case List(x) => List()
	case y :: ys => y :: init(ys)
};System.out.println("""init: [T](xs: List[T])List[T]""");$skip(24); val res$0 = 

init(List(1, 2, 3, 4));System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(121); 

def concat[T](xs: List[T], ys: List[T]): List[T] = xs match {
	case List() => ys
	case z :: zs => z :: concat(zs, ys)
};System.out.println("""concat: [T](xs: List[T], ys: List[T])List[T]""");$skip(38); val res$1 = 

concat(List(1, 2, 3), List(4, 5, 6));System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(112); 

def reverse[T](xs: List[T]): List[T] = xs match {
	case List() => xs
	case y :: ys => reverse(ys) ++ List(y)
};System.out.println("""reverse: [T](xs: List[T])List[T]""");$skip(24); val res$2 = 

reverse(List(1, 2, 3));System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(142); 
	
def removeAt[T](n: Int, xs: List[T]): List[T] = xs match {
	case List() => xs
	case y :: ys => if (n == 0) ys else y :: removeAt(n-1, ys)
};System.out.println("""removeAt: [T](n: Int, xs: List[T])List[T]""");$skip(30); val res$3 = 
	
removeAt(10, List(1, 2, 3));System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(28); val res$4 = 
removeAt(-1, List(1, 2, 3));System.out.println("""res4: List[Int] = """ + $show(res$4));$skip(27); val res$5 = 
removeAt(1, List(1, 2, 3));System.out.println("""res5: List[Int] = """ + $show(res$5));$skip(258); 

def flatten(xs: List[Any]): List[Any] = xs match {
	case List() => xs
	case List(y) => if (y.isInstanceOf[List[Any]]) flatten(y.asInstanceOf[List[Any]]) else List(y)
	case List(y) :: ys => flatten(List(y)) :: flatten(ys)
	case y :: ys => y :: flatten(ys)
};System.out.println("""flatten: (xs: List[Any])List[Any]""");$skip(51); val res$6 = 

flatten(List(List(1, 1), 2, List(3, List(5, 8))));System.out.println("""res6: List[Any] = """ + $show(res$6))}
}
