class Rational(n: Int, d: Int = 1) {
  require(d != 0, "Denominator must be non-zero")
  private val g = gcd(n.abs, d.abs)
  val numer = n / g
  val denom = d / g

  def neg: Rational = new Rational(-numer, denom)

  def sub(other: Rational): Rational = new Rational(
    numer * other.denom - other.numer * denom,
    denom * other.denom
  )

  override def toString: String = s"$numer/$denom"

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
}