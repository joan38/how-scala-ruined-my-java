//> using dep com.comcast::ip4s-core:3.7.0
//> using dep com.github.japgolly.scalacss::core:1.0.0
//> using dep io.circe::circe-literal:0.14.13
//> using dep org.tpolecat::skunk-core:0.6.4

/*
  ▗▄▄▖▗▄▄▄▖▗▄▄▖ ▗▄▄▄▖▗▖  ▗▖ ▗▄▄▖    ▗▄▄▄▖▗▖  ▗▖▗▄▄▄▖▗▄▄▄▖▗▄▄▖ ▗▄▄▖  ▗▄▖ ▗▖    ▗▄▖▗▄▄▄▖▗▄▄▄▖ ▗▄▖ ▗▖  ▗▖ ▗▄▄▖
 ▐▌     █  ▐▌ ▐▌  █  ▐▛▚▖▐▌▐▌         █  ▐▛▚▖▐▌  █  ▐▌   ▐▌ ▐▌▐▌ ▐▌▐▌ ▐▌▐▌   ▐▌ ▐▌ █    █  ▐▌ ▐▌▐▛▚▖▐▌▐▌
  ▝▀▚▖  █  ▐▛▀▚▖  █  ▐▌ ▝▜▌▐▌▝▜▌      █  ▐▌ ▝▜▌  █  ▐▛▀▀▘▐▛▀▚▖▐▛▀▘ ▐▌ ▐▌▐▌   ▐▛▀▜▌ █    █  ▐▌ ▐▌▐▌ ▝▜▌ ▝▀▚▖
 ▗▄▄▞▘  █  ▐▌ ▐▌▗▄█▄▖▐▌  ▐▌▝▚▄▞▘    ▗▄█▄▖▐▌  ▐▌  █  ▐▙▄▄▖▐▌ ▐▌▐▌   ▝▚▄▞▘▐▙▄▄▖▐▌ ▐▌ █  ▗▄█▄▖▝▚▄▞▘▐▌  ▐▌▗▄▄▞▘
*/

val Strings =
  val firstName = "Joan"
  val lastName = "Goyeau"
  s"Hello $firstName $lastName"


val IPs =
  import com.comcast.ip4s.*

  val localhost = Ipv4Address.fromString("127.0.0.1")
  val localhost2 = ip"::1"


val Colors =
  import scalacss.internal.Dsl.*

  val color = c"#ffcc99"


val JSON =
  import io.circe.literal.*

  val person = json"""{
    "firstname": "Joan",
    "lastname": "Goyeau"
  }"""


val SQL =
  import skunk.implicits.*

  sql"SELECT name FROM country"
