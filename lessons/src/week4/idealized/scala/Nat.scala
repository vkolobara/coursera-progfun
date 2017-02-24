package week4.idealized.scala

abstract class Nat {
  def isZero: scala.Boolean
  def predecessor: Nat
  def successor = new Succ(this)
  def + (that: Nat): Nat
  def - (that: Nat): Nat 
}

object Zero extends Nat {
  def isZero = true
  
  def predecessor = throw new IllegalArgumentException("Predecessor of zero not possible")
  
  def + (that: Nat): Nat = that
  def - (that: Nat): Nat = if (that.isZero) this else throw new IllegalArgumentException("Cant subtract from zero")
  
}

class Succ(n: Nat) extends Nat {
  def isZero = false
  
  def predecessor = n
  
  def + (that: Nat) = new Succ(n + that)
  def - (that: Nat) = if (that.isZero) this else new Succ(n - that.predecessor)
  
}