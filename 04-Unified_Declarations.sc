/*
 ▗▖ ▗▖▗▖  ▗▖▗▄▄▄▖▗▄▄▄▖▗▄▄▄▖▗▄▄▄▖▗▄▄▄     ▗▄▄▄ ▗▄▄▄▖ ▗▄▄▖▗▖    ▗▄▖ ▗▄▄▖  ▗▄▖▗▄▄▄▖▗▄▄▄▖ ▗▄▖ ▗▖  ▗▖ ▗▄▄▖
 ▐▌ ▐▌▐▛▚▖▐▌  █  ▐▌     █  ▐▌   ▐▌  █    ▐▌  █▐▌   ▐▌   ▐▌   ▐▌ ▐▌▐▌ ▐▌▐▌ ▐▌ █    █  ▐▌ ▐▌▐▛▚▖▐▌▐▌
 ▐▌ ▐▌▐▌ ▝▜▌  █  ▐▛▀▀▘  █  ▐▛▀▀▘▐▌  █    ▐▌  █▐▛▀▀▘▐▌   ▐▌   ▐▛▀▜▌▐▛▀▚▖▐▛▀▜▌ █    █  ▐▌ ▐▌▐▌ ▝▜▌ ▝▀▚▖
 ▝▚▄▞▘▐▌  ▐▌▗▄█▄▖▐▌   ▗▄█▄▖▐▙▄▄▖▐▙▄▄▀    ▐▙▄▄▀▐▙▄▄▖▝▚▄▄▖▐▙▄▄▖▐▌ ▐▌▐▌ ▐▌▐▌ ▐▌ █  ▗▄█▄▖▝▚▄▞▘▐▌  ▐▌▗▄▄▞▘
*/

// All the declarations in Scala are unified, which means that you can declare a variable,
// a function, or a value in the same way just selecting the modifier keyword you want.

// The only differences are:
// - A val can be lazy
// - A def can have parameters

def x =
  println("Evaluating x")

val y =
  println("Evaluating y")

lazy val z =
  println("Evaluating z")

// x
// x

// y
// y

// z
// z
