package week2

object curry {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(136); 

  def product(f: Int => Int)(a: Int, b: Int): Int = {
		if (a > b) 1
		else f(a) * product(f)(a+1, b)
  };System.out.println("""product: (f: Int => Int)(a: Int, b: Int)Int""");$skip(24); val res$0 = 

	product(x => x)(1, 5);System.out.println("""res0: Int = """ + $show(res$0));$skip(49); 
	
	def factorial(n: Int) = product(x => x)(1, n);System.out.println("""factorial: (n: Int)Int""");$skip(14); val res$1 = 
	factorial(5);System.out.println("""res1: Int = """ + $show(res$1))}

}
