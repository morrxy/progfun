package week4

/**
 * Created by hj on 5/19/14.
 */
trait List[T] {
  def isEmpty: Boolean
  def head: T
  def tail: List[T]
}

class Cons[T](val head: T, val tail: List[T]) extends List[T] {
  def isEmpty = false
}

class Nil[T] extends List[T] {
  def isEmpty: Boolean = true
  def head: Nothing = throw  new NoSuchElementException("Nil.head")
  def tail: Nothing = throw  new NoSuchElementException("Nil.tail")
}