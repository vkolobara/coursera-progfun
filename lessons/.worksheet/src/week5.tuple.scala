package week5

object tuple {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(73); 
  println("Welcome to the Scala worksheet");$skip(458); 

  def msort[T](xs: List[T]): List[T] = {

    val n = xs.length / 2
    if (n == 0) xs
    else {
      def merge(xs: List[T], ys: List[T]): List[T] = {
        (xs, ys) match {
          case (Nil, ys)            => ys
          case (xs, Nil)            => xs
          case (x :: xs1, y :: ys1) => if (x < y) x :: merge(xs1, ys) else y :: merge(xs, ys1)
        }
      }
      val (fst, snd) = xs splitAt n
      merge(msort(fst), msort(snd))
    }
  };System.out.println("""msort: [T](xs: List[T])List[T]""");$skip(39); val res$0 = 

  msort(List(1, 4, 5), List(1, 2, 3));System.out.println("""res0: <error> = """ + $show(res$0))}
}
