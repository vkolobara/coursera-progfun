package week5

object higherOrderLists {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(85); 
  println("Welcome to the Scala worksheet");$skip(129); 

  def squareList(xs: List[Int]): List[Int] = xs match {
    case Nil     => xs
    case y :: ys => y * y :: squareList(ys)
  };System.out.println("""squareList: (xs: List[Int])List[Int]""");$skip(74); 

  def squareListMap(xs: List[Int]): List[Int] =
    xs map (x => x * x);System.out.println("""squareListMap: (xs: List[Int])List[Int]""");$skip(40); 

  val nums = List(2, -4, 91, 23, -10);System.out.println("""nums  : List[Int] = """ + $show(nums ));$skip(62); 
  val fruits = List("apple", "pineapple", "orange", "banana");System.out.println("""fruits  : List[String] = """ + $show(fruits ));$skip(29); val res$0 = 

  nums filter (x => x > 0);System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(30); val res$1 = 
  nums filterNot (x => x > 0);System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(30); val res$2 = 
  nums partition (x => x > 0);System.out.println("""res2: (List[Int], List[Int]) = """ + $show(res$2));$skip(32); val res$3 = 

  nums takeWhile (x => x > 0);System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(30); val res$4 = 
  nums dropWhile (x => x > 0);System.out.println("""res4: List[Int] = """ + $show(res$4));$skip(25); val res$5 = 
  nums span (x => x > 0);System.out.println("""res5: (List[Int], List[Int]) = """ + $show(res$5));$skip(178); 

  def pack[T](xs: List[T]): List[List[T]] = xs match {
    case Nil => Nil
    case x :: xs1 =>
      val (first, rest) = xs span (y => y == x)
      first :: pack(rest)

  };System.out.println("""pack: [T](xs: List[T])List[List[T]]""");$skip(55); 

  val data = List("a", "a", "a", "b", "c", "c", "a");System.out.println("""data  : List[String] = """ + $show(data ));$skip(13); val res$6 = 
  pack(data);System.out.println("""res6: List[List[String]] = """ + $show(res$6));$skip(92); 

  def encode[T](xs: List[T]): List[(T, Int)] =
    pack(xs) map (x => (x.head, x.length));System.out.println("""encode: [T](xs: List[T])List[(T, Int)]""");$skip(17); val res$7 = 

  encode(data);System.out.println("""res7: List[(String, Int)] = """ + $show(res$7));$skip(85); 

  def concat[T](xs: List[T], ys: List[T]): List[T] =
    (xs foldRight ys)(_ :: _);System.out.println("""concat: [T](xs: List[T], ys: List[T])List[T]""");$skip(99); 
    
  def mapFun[T, U](xs: List[T], f: T => U): List[U] =
  	(xs foldRight List[U]()) (f(_) :: _);System.out.println("""mapFun: [T, U](xs: List[T], f: T => U)List[U]""");$skip(84); 
  	
  def lengthFun[T](xs: List[T]): Int =
  	(xs foldRight 0)((_, acc) => acc + 1);System.out.println("""lengthFun: [T](xs: List[T])Int""")}

}
