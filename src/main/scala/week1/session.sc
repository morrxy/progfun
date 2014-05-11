def sqrtIter(guess: Double, x: Double): Double =
  if (isGoodEnough(guess, x)) guess
  else sqrtIter(improve(guess, x), x)

def isGoodEnough(guess: Double, x: Double) =
  math.abs(guess * guess - x) / x < 0.0001

def improve(guess: Double, x: Double) =
  (guess + x / guess) / 2
def sqrt(x: Double) = sqrtIter(1.0, x)
sqrt(2.0)
sqrt(0.001)
sqrt(01.e-20)
sqrt(1.0e20)
sqrt(1.0e50)