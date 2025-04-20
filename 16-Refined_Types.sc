//> using dep io.github.iltotore::iron:3.0.0
/*
 ▗▄▄▖ ▗▄▄▄▖▗▄▄▄▖▗▄▄▄▖▗▖  ▗▖▗▄▄▄▖▗▄▄▄     ▗▄▄▄▖▗▖  ▗▖▗▄▄▖ ▗▄▄▄▖ ▗▄▄▖
 ▐▌ ▐▌▐▌   ▐▌     █  ▐▛▚▖▐▌▐▌   ▐▌  █      █   ▝▚▞▘ ▐▌ ▐▌▐▌   ▐▌   
 ▐▛▀▚▖▐▛▀▀▘▐▛▀▀▘  █  ▐▌ ▝▜▌▐▛▀▀▘▐▌  █      █    ▐▌  ▐▛▀▘ ▐▛▀▀▘ ▝▀▚▖
 ▐▌ ▐▌▐▙▄▄▖▐▌   ▗▄█▄▖▐▌  ▐▌▐▙▄▄▖▐▙▄▄▀      █    ▐▌  ▐▌   ▐▙▄▄▖▗▄▄▞▘
*/

import io.github.iltotore.iron.*
import io.github.iltotore.iron.constraint.all.*


type Id = String :| (MinLength[3] & MaxLength[32])

case class User(id: Id, username: String, email: String)

def fetch(id: Id): User = ???

fetch("john") // all good
//fetch("")     // fail at compile time


type Username = String :| Alphanumeric

type Email = String :| (Match["^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$"] DescribedAs "Value should be an email")

//At least one upper, one lower and one number
type Password = String :| (Match["^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]+$"] DescribedAs
  "Value should contain at least an upper, a lower and a number")

// All the pre-defined constraints: https://iltotore.github.io/iron/docs/reference/constraint.html#pre-defined-constraints-1
