package week5
import math.Ordering

object mergeSort {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  def msort[T](xs: List[T])(implicit ord: Ordering[T]): List[T] = {

    val n = xs.length / 2
    if (n == 0) xs
    else {
      def merge(xs: List[T], ys: List[T]): List[T] = {
        (xs, ys) match {
          case (Nil, ys)            => ys
          case (xs, Nil)            => xs
          case (x :: xs1, y :: ys1) => if (ord.lt(x, y)) x :: merge(xs1, ys) else y :: merge(xs, ys1)
        }
      }
      val (fst, snd) = xs splitAt n
      merge(msort(fst), msort(snd))
    }
  }                                               //> msort: [T](xs: List[T])(implicit ord: scala.math.Ordering[T])List[T]
  
  msort(List(1, 4, 5, 1, 2, 3))                   //> res0: List[Int] = List(1, 1, 2, 3, 4, 5)
                                                  
  msort(List("apple", "pineapple", "orange", "banana"))
                                                  //> res1: List[String] = List(apple, banana, orange, pineapple)
}