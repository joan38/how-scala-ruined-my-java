/*
 ▗▄▄▄▖▗▖  ▗▖▗▄▄▖ ▗▄▄▖ ▗▄▄▄▖ ▗▄▄▖ ▗▄▄▖▗▄▄▄▖ ▗▄▖ ▗▖  ▗▖    ▗▄▄▄▖▗▖  ▗▖▗▄▄▄▖▗▄▄▖▗▖  ▗▖▗▄▄▄▖▗▖ ▗▖▗▄▄▄▖▗▖  ▗▖ ▗▄▄▖
 ▐▌    ▝▚▞▘ ▐▌ ▐▌▐▌ ▐▌▐▌   ▐▌   ▐▌     █  ▐▌ ▐▌▐▛▚▖▐▌    ▐▌   ▐▌  ▐▌▐▌   ▐▌ ▐▌▝▚▞▘   █  ▐▌ ▐▌  █  ▐▛▚▖▐▌▐▌
 ▐▛▀▀▘  ▐▌  ▐▛▀▘ ▐▛▀▚▖▐▛▀▀▘ ▝▀▚▖ ▝▀▚▖  █  ▐▌ ▐▌▐▌ ▝▜▌    ▐▛▀▀▘▐▌  ▐▌▐▛▀▀▘▐▛▀▚▖ ▐▌    █  ▐▛▀▜▌  █  ▐▌ ▝▜▌▐▌▝▜▌
 ▐▙▄▄▖▗▞▘▝▚▖▐▌   ▐▌ ▐▌▐▙▄▄▖▗▄▄▞▘▗▄▄▞▘▗▄█▄▖▝▚▄▞▘▐▌  ▐▌    ▐▙▄▄▖ ▝▚▞▘ ▐▙▄▄▖▐▌ ▐▌ ▐▌    █  ▐▌ ▐▌▗▄█▄▖▐▌  ▐▌▝▚▄▞▘
*/

// Everything is an expression. Therefore, everything returns a value.
true: Boolean
1 + 1: Int
1 + 2.0: Double

// Printing returns Unit
println("boo")
// Unit is equivalent to void in Java.
// It is used to represent a unit of computation.

// if/else returns the lowest common type
val isScala = true
val answer = if isScala then "yes" else "no"
val exception = if true then IllegalStateException() else IllegalArgumentException()

// ifs without else returns Unit
val r: Unit = if isScala then "yes"

// Semicolons are optional but can be used
val x = 1;

// Blocks of codes are indentation significant (like Python)
def add(a: Int, b: Int) =
  println(s"Adding $a and $b")
  val result = a + b
  result

// Or can be enclosed in curly braces (like Java)
def add2(a: Int, b: Int) = {
  println(s"Adding $a and $b")
  val result = a + b
  result
}

// Or can be ended with the end keyword
def add3(a: Int, b: Int) =
  println(s"Adding $a and $b")
  val result = a + b
  result
end add3

// Blocks of code can also be given to val or vars
val message =
  val first = "Reed"
  val last = "Hastings"
  s"The firstname is $first and lastname $last"

// Remember: The last expression is returned in any block of code
