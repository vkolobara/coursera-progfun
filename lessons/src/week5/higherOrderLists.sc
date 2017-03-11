package week5

object higherOrderLists {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  def squareList(xs: List[Int]): List[Int] = xs match {
    case Nil     => xs
    case y :: ys => y * y :: squareList(ys)
  }                                               //> squareList: (xs: List[Int])List[Int]

  def squareListMap(xs: List[Int]): List[Int] =
    xs map (x => x * x)                           //> squareListMap: (xs: List[Int])List[Int]

  val nums = List(2, -4, 91, 23, -10)             //> nums  : List[Int] = List(2, -4, 91, 23, -10)
  val fruits = List("apple", "pineapple", "orange", "banana")
                                                  //> fruits  : List[String] = List(apple, pineapple, orange, banana)

  nums filter (x => x > 0)                        //> res0: List[Int] = List(2, 91, 23)
  nums filterNot (x => x > 0)                     //> res1: List[Int] = List(-4, -10)
  nums partition (x => x > 0)                     //> res2: (List[Int], List[Int]) = (List(2, 91, 23),List(-4, -10))

  nums takeWhile (x => x > 0)                     //> res3: List[Int] = List(2)
  nums dropWhile (x => x > 0)                     //> res4: List[Int] = List(-4, 91, 23, -10)
  nums span (x => x > 0)                          //> res5: (List[Int], List[Int]) = (List(2),List(-4, 91, 23, -10))

  def pack[T](xs: List[T]): List[List[T]] = xs match {
    case Nil => Nil
    case x :: xs1 =>
      val (first, rest) = xs span (y => y == x)
      first :: pack(rest)

  }                                               //> pack: [T](xs: List[T])List[List[T]]

  val data = List("a", "a", "a", "b", "c", "c", "a")
                                                  //> data  : List[String] = List(a, a, a, b, c, c, a)
  pack(data)                                      //> res6: List[List[String]] = List(List(a, a, a), List(b), List(c, c), List(a))
                                                  //| 

  def encode[T](xs: List[T]): List[(T, Int)] =
    pack(xs) map (x => (x.head, x.length))        //> encode: [T](xs: List[T])List[(T, Int)]

  encode(data)                                    //> res7: List[(String, Int)] = List((a,3), (b,1), (c,2), (a,1))

  def concat[T](xs: List[T], ys: List[T]): List[T] =
    (xs foldRight ys)(_ :: _)                     //> concat: [T](xs: List[T], ys: List[T])List[T]
    
  def mapFun[T, U](xs: List[T], f: T => U): List[U] =
  	(xs foldRight List[U]()) (f(_) :: _)      //> mapFun: [T, U](xs: List[T], f: T => U)List[U]
  	
  def lengthFun[T](xs: List[T]): Int =
  	(xs foldRight 0)((_, acc) => acc + 1)     //> lengthFun: [T](xs: List[T])Int

}