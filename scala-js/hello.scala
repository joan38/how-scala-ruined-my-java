//> using platform scala-js
//> using jsModuleKind es
//> using dep com.raquo::laminar::17.2.1

import org.scalajs.dom
import com.raquo.laminar.api.L.{*, given}

@main def hello =
  val nameVar = Var(initial = "world")

  val app = div(
    label("Your name: "),
    input(
      onMountFocus,
      placeholder := "Enter your name here",
      onInput.mapToValue --> nameVar
    ),
    div(
      "Hello, ",
      child.text <-- nameVar.signal.map(_.toUpperCase)
    )
  )

  renderOnDomContentLoaded(dom.document.getElementById("app"), app)
