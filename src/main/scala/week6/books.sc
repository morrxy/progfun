case class Book(title: String, authors: List[String])

val books: Set[Book] = Set(
  Book(title = "Structure and Interpetation of Computer Programs",
    authors = List("Abelso, Harald", "Susman, Gerald J.")),
  Book(title = "Introduction to Functional Programming",
    authors = List("Bird, Richard", "Wadler, Phil")),
  Book(title = "Effective Java",
    authors = List("Bloch, Joshua")),
  Book(title = "Effective Java2",
    authors = List("Bloch, Joshua")),
  Book(title = "Java Puzzlers",
    authors = List("Bloch, Joshua", "Gafter, Neal")),
  Book(title = "Programming in Scala",
    authors = List("Odersky, Martin","Spoon, Lex", "Veneers, Bill")))

for (b <- books; a <- b.authors if a startsWith "Bird,")
  yield b.title

for (b <- books if b.title.indexOf("Program") >= 0)
  yield b.title


for {
  b1 <- books
  b2 <- books
  if b1.title < b2.title
  a1 <- b1.authors
  a2 <- b2.authors
  if a1 == a2
} yield a1