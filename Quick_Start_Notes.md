Quick Start Demo Notes
======================

* ```shell
  mkdir hello && cd $_
  ```
* Install Scala:
  https://scala-cli.virtuslab.org/install
* Enable power if needed:
  ```shell
  scala config power true
  ```
* Demo simple main `hello.scala`:
  ```scala
  @main def hello =
    println("Hello")
  ```
  ```shell
  ./scala .
  ```
* Open in IDE, show full IDE support.
* Add params:
  ```scala
  @main def hello(name: String) =
    println(s"Hello $name")
  ```
  ```shell
  ./scala . -- JUG
  ```
* Package as executable jar:
  ```shell
  ./scala package .
  ```
  Display size:
  ```shell
  du -h hello
  ```
  And time:
  ```shell
  time ./hello
  ```
* Package Native GraalVM image:
  ```shell
  ./scala package . --native-image -f
  ```
  Display size and time.
* Specify the JVM version:
  ```scala
  //> using jvm 22
  ```
  Java will be downloaded if not installed
* Add a dep:
  ```scala
  //> using dep com.lihaoyi::os-lib:0.11.4
  os.list(os.pwd).foreach(println)
  ```
* GraalVM with dep:
  ```shell
  ./scala package . --native-image -o ls
  ```
* Turn it into a script by `.scala` => `.sc`
  and remove main.
* Read the into file copied from the presentation: 
  ```scala
  val content = os.read(os.pwd / "00-Intro.md")
  println(content)
  ```
* Shebang:
  ```scala
  #!/usr/bin/env -S ./scala shebang
  ```
  ```shell
  chmod +x hello.sc
  ./hello.sc
  ```
