fun main() {
  val setA = setOf(1, 2, 3, 5, 4)
  val setB = setOf(2, 3)
  val setC = setOf(1, 6, 5, 7)

  // Combined
  val union = setA.union(setC)
  //Slicce 
  val intersect = setA.intersect(setC)

  println(setA == setB)
  println(union)
  println(intersect)
}