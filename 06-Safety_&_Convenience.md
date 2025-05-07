


     ▗▄▄▖ ▗▄▖ ▗▄▄▄▖▗▄▄▄▖▗▄▄▄▖▗▖  ▗▖    ▗▄▖ ▗▖  ▗▖▗▄▄▄      ▗▄▄▖ ▗▄▖ ▗▖  ▗▖▗▖  ▗▖▗▄▄▄▖▗▖  ▗▖▗▄▄▄▖▗▄▄▄▖▗▖  ▗▖ ▗▄▄▖▗▄▄▄▖
    ▐▌   ▐▌ ▐▌▐▌   ▐▌     █   ▝▚▞▘    ▐▌ ▐▌▐▛▚▖▐▌▐▌  █    ▐▌   ▐▌ ▐▌▐▛▚▖▐▌▐▌  ▐▌▐▌   ▐▛▚▖▐▌  █  ▐▌   ▐▛▚▖▐▌▐▌   ▐▌
     ▝▀▚▖▐▛▀▜▌▐▛▀▀▘▐▛▀▀▘  █    ▐▌     ▐▛▀▜▌▐▌ ▝▜▌▐▌  █    ▐▌   ▐▌ ▐▌▐▌ ▝▜▌▐▌  ▐▌▐▛▀▀▘▐▌ ▝▜▌  █  ▐▛▀▀▘▐▌ ▝▜▌▐▌   ▐▛▀▀▘
    ▗▄▄▞▘▐▌ ▐▌▐▌   ▐▙▄▄▖  █    ▐▌     ▐▌ ▐▌▐▌  ▐▌▐▙▄▄▀    ▝▚▄▄▖▝▚▄▞▘▐▌  ▐▌ ▝▚▞▘ ▐▙▄▄▖▐▌  ▐▌▗▄█▄▖▐▙▄▄▖▐▌  ▐▌▝▚▄▄▖▐▙▄▄▖

                                                       PICK TWO



* **Quick script** <-----> **Large scale systems**

* **Dynamic Typing** <-----> **Statically Typed**

Those are often seen as tradeoff languages chose to go one direction or the other.


# Tuple <-----> Named tuple <-----> Classes

```java
import java.util.Map;

Map.of("key", 1, "key2", 2);
```
```scala
Map(("key", 1), ("key2", 2))
```

```scala
def points(): List[(Double, Double)] = ???

def points(): List[(x: Double, y: Double)] = ???

case class Point(x: Double, y: Double)
def points(): List[Point] = ???
```

```scala
val rawJson = toJson(
  (
    name = (first = "Joan", last = "Goyeau"),
    employer = "Netflix Inc",
    role = "Data Engineer"
  )
)

val msg = read[(name: (first: String))](rawJson)
println(msg.name.first.trim)
```


# Union and Singleton types <-----> Enum 

```scala
def listAvailableBoats(
  location: "Miami" | "North Miami" | "Fort Lauderdale" | "Pompano Beach",
  date: LocalDate,
  time: "Full Day 9:00 to 5:00" | "Half Day 9:00 to 1:00" | "Half Day 2:00 to 6:00",
  boatMake: Option["Hurricane" | "Cobia"] = None
): Seq[WebElement] = ???
```
                                       <----->
```scala
enum Suit:
  case Heart, Diamond, Club, Spades

enum Play:
  case Pass
  case Bet(amount: Dollars)
  case Reveal(cards: List[Cards])
  case Batch(plays: List[Play])
```
