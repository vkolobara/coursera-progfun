package week2

object rational {
  val x = new Rational(1, 3)                      //> x  : week2.Rational = 1/3

  val y = new Rational(5, 7)                      //> y  : week2.Rational = 5/7

  val z = new Rational(3, 2)                      //> z  : week2.Rational = 3/2

  x.sub(y).sub(z)                                 //> res0: week2.Rational = -79/42

  y.add(y)                                        //> res1: week2.Rational = 10/7
  
  x.less(y)                                       //> res2: Boolean = true
	x.max(y)                                  //> res3: week2.Rational = 5/7
}

class Rational(x: Int, y: Int) {

  require(y != 0, "denom must be positive")

	def this(x: Int) = this(x, 1)

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  private val g = gcd(x, y)
  def numer = x / g
  def denom = y / g
  

	def less(that: Rational) = numer * that.denom < that.numer * denom
	
	def max(that: Rational) = if (this.less(that)) that else this

  def add(that: Rational) =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom)

  def neg = new Rational(-numer, denom)

  def sub(that: Rational) = add(that.neg)
  
  

  override def toString = numer + "/" + denom
}