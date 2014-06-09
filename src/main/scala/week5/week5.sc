object week5 {
  val fruit = List("apples", "oranges", "pears")
  val nums = List(1, 2, 3)
  val diag3 = List(List(1, 0, 0), List(0, 1, 0), List(0, 0, 1))

  def removeAt(n: Int, xs: List[Int]): List[Int] =
    xs.take(n) ++ xs.drop(n + 1)
  removeAt(0, nums)
  removeAt(1, nums)
  removeAt(2, nums)
  removeAt(3, nums)
}