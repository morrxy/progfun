val x = new Rational(1, 3)

val y = new Rational(5, 7)

val z = new Rational(3, 2)

x.numer
x.denom
x.sub(y).sub(z)




y.add(y)

x.less(y)
x.max(y)
val strange = new Rational(1, 0)

strange.add(strange)
class Rational(x: Int, y: Int) {
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  private val g = gcd(x, y)
  println("gcd: " + g)
  def numer = x / g
  def denom = y / g

  def less(that: Rational) = numer * that.denom < that.numer * denom

  def max(that: Rational) = if (this.less(that)) that else this

  def add(that: Rational) =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom)
  def neg: Rational =
    new Rational(-numer, denom)
  def sub(that: Rational) = add(that.neg)
  override def toString = numer + "/" + denom
}
