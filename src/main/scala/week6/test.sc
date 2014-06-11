val xs = Array[Int](1, 2, 3, 44)
xs map (x => x * 2)

val s = "Hello World"
s filter (c => c.isUpper)

s exists (c => c.isUpper)
s forall (c => c.isUpper)

val pairs = List(1, 2, 3) zip s
pairs.unzip

s flatMap (c => List('.', c))

xs.sum
xs.max

(1 to 3) flatMap (x => (1 to 2) map (y => (x, y)))

def scalarProduct(xs: Vector[Double], ys: Vector[Double]): Double =
  (xs zip ys).map(xy => xy._1 * xy._2).sum
scalarProduct(Vector(1, 2, 3), Vector(2, 3, 4))

def scalarProduct2(xs: Vector[Double], ys: Vector[Double]): Double =
  (xs zip ys).map{case (x, y) => x * y}.sum
scalarProduct2(Vector(1, 2, 3), Vector(2, 3, 4))

def isPrime(n: Int): Boolean = (2 until n) forall (d => n % d != 0)

isPrime(15)
isPrime(11)