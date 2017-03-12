package week6

object collections {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(79); 
  println("Welcome to the Scala worksheet");$skip(33); 
  
  val xs = Array(1, 2, 3, 44);System.out.println("""xs  : Array[Int] = """ + $show(xs ));$skip(21); val res$0 = 
  xs map(x => x * 2);System.out.println("""res0: Array[Int] = """ + $show(res$0));$skip(27); 
  
  val s = "Hello World";System.out.println("""s  : String = """ + $show(s ));$skip(28); val res$1 = 
  s filter (c => c.isUpper);System.out.println("""res1: String = """ + $show(res$1));$skip(31); val res$2 = 
  
  s exists (c => c.isUpper);System.out.println("""res2: Boolean = """ + $show(res$2));$skip(28); val res$3 = 
  s forall (c => c.isUpper);System.out.println("""res3: Boolean = """ + $show(res$3));$skip(37); 
  
  val pairs = List(1, 2, 3) zip s;System.out.println("""pairs  : List[(Int, Char)] = """ + $show(pairs ));$skip(14); val res$4 = 
  pairs.unzip;System.out.println("""res4: (List[Int], List[Char]) = """ + $show(res$4));$skip(35); val res$5 = 
  
  s flatMap (c => List('.', c));System.out.println("""res5: String = """ + $show(res$5));$skip(12); val res$6 = 
  
  xs.sum;System.out.println("""res6: Int = """ + $show(res$6));$skip(9); val res$7 = 
  xs.max;System.out.println("""res7: Int = """ + $show(res$7));$skip(9); val res$8 = 
  xs.min;System.out.println("""res8: Int = """ + $show(res$8));$skip(13); val res$9 = 
  xs.product;System.out.println("""res9: Int = """ + $show(res$9));$skip(60); val res$10 = 
  
  
  (1 to 10) flatMap (x => (1 to 5) map (y => (x, y)));System.out.println("""res10: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$10));$skip(79); 
  
  
  
  def isPrime(n: Int): Boolean = (2 until n) forall (d => n % d != 0);System.out.println("""isPrime: (n: Int)Boolean""");$skip(18); 
  
  
  val n = 7;System.out.println("""n  : Int = """ + $show(n ));$skip(109); val res$11 = 
  
 	(1 until n) flatMap (i =>
 		(1 until i) map (j => (i, j))) filter (pair => isPrime(pair._1 + pair._2));System.out.println("""res11: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$11))}
  
}
