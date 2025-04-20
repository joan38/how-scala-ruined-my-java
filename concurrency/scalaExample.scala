//> using jvm 24
//> using dep com.softwaremill.ox::core:0.5.13

import ox.*

/** This example demonstrates structured concurrency using Ox in Scala.
  * @see https://ox.softwaremill.com
  */
@main def scalaExample =
  val (userName, balance) = par(getUserName(), getBalance())
  println(s"$userName's account balance is $balance$$")

/** This example is a little more involed but gives more control.
  */
@main def scalaSupervisedOxExample = supervised {
  val userName = fork(getUserName())
  val balance = fork(getBalance())
  println(s"${userName.join()}'s account balance is ${balance.join()}$$")
}

/** Some API calls that take time to complete
  */
private def getUserName() =
  println("Getting username")
  Thread.sleep(2000)
  println("Got username")
  "Toto"

/** Some API calls that take time to complete
  */
private def getBalance() =
  println("Getting balance")
  Thread.sleep(1000)
  println("Got balance")
  100
