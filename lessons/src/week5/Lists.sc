package week5

object Lists {
  
def init[T](xs: List[T]): List[T] = xs match {
	case List() => throw new Error("Init of empty list")
	case List(x) => List()
	case y :: ys => y :: init(ys)
}                                                 //> init: [T](xs: List[T])List[T]

init(List(1, 2, 3, 4))                            //> res0: List[Int] = List(1, 2, 3)

def concat[T](xs: List[T], ys: List[T]): List[T] = xs match {
	case List() => ys
	case z :: zs => z :: concat(zs, ys)
}                                                 //> concat: [T](xs: List[T], ys: List[T])List[T]

concat(List(1, 2, 3), List(4, 5, 6))              //> res1: List[Int] = List(1, 2, 3, 4, 5, 6)

def reverse[T](xs: List[T]): List[T] = xs match {
	case List() => xs
	case y :: ys => reverse(ys) ++ List(y)
}                                                 //> reverse: [T](xs: List[T])List[T]

reverse(List(1, 2, 3))                            //> res2: List[Int] = List(3, 2, 1)
	
def removeAt[T](n: Int, xs: List[T]): List[T] = xs match {
	case List() => xs
	case y :: ys => if (n == 0) ys else y :: removeAt(n-1, ys)
}                                                 //> removeAt: [T](n: Int, xs: List[T])List[T]
	
removeAt(10, List(1, 2, 3))                       //> res3: List[Int] = List(1, 2, 3)
removeAt(-1, List(1, 2, 3))                       //> res4: List[Int] = List(1, 2, 3)
removeAt(1, List(1, 2, 3))                        //> res5: List[Int] = List(1, 3)

def flatten(xs: List[Any]): List[Any] = xs match {
	case List() => xs
	case List(y) => if (y.isInstanceOf[List[Any]]) flatten(y.asInstanceOf[List[Any]]) else List(y)
	case List(y) :: ys => flatten(List(y)) :: flatten(ys)
	case y :: ys => y :: flatten(ys)
}                                                 //> flatten: (xs: List[Any])List[Any]

flatten(List(List(1, 1), 2, List(3, List(5, 8)))) //> res6: List[Any] = List(List(1, 1), 2, 3, 5, 8)
}