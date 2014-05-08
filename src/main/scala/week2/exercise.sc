import scala.annotation.tailrec

def factorial(n: Int): Int = {
  //  if (n == 0) 1 else n * factorial(n - 1)
  @tailrec
  def fac_iter(n: Int, result: Int): Int =
    if (n == 0) result
    else fac_iter(n - 1, n * result)

  fac_iter(n, 1)
}

factorial(4)