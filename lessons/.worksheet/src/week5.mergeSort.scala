package week5
import math.Ordering

object mergeSort {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(98); 
  println("Welcome to the Scala worksheet");$skip(492); 

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
  };System.out.println("""msort: [T](xs: List[T])(implicit ord: scala.math.Ordering[T])List[T]""");$skip(35); val res$0 = 
  
  msort(List(1, 4, 5, 1, 2, 3));System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(107); val res$1 = 
                                                  
  msort(List("apple", "pineapple", "orange", "banana"));System.out.println("""res1: List[String] = """ + $show(res$1))}
}
