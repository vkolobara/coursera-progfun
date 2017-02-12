package week2

object higherOrder {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(190); 
	def sum(f: Int => Int)(a: Int, b: Int): Int = {
		def loop(a: Int, acc: Int): Int = {
			if (a > b) acc
			else loop(a+1, acc + f(a))
		}
		loop(a, 0)
	};System.out.println("""sum: (f: Int => Int)(a: Int, b: Int)Int""");$skip(21); val res$0 = 
	
	sum(x => x)(1, 5);System.out.println("""res0: Int = """ + $show(res$0))}
}
