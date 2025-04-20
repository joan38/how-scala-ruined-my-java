/*
 ▗▄▄▄ ▗▄▄▄▖▗▄▄▖ ▗▄▄▄▖▗▖  ▗▖▗▄▄▄ ▗▄▄▄▖▗▖  ▗▖ ▗▄▄▖▗▖  ▗▖    ▗▄▄▄▖▗▖  ▗▖   ▗▖▗▄▄▄▖ ▗▄▄▖▗▄▄▄▖▗▄▄▄▖ ▗▄▖ ▗▖  ▗▖
 ▐▌  █▐▌   ▐▌ ▐▌▐▌   ▐▛▚▖▐▌▐▌  █▐▌   ▐▛▚▖▐▌▐▌    ▝▚▞▘       █  ▐▛▚▖▐▌   ▐▌▐▌   ▐▌     █    █  ▐▌ ▐▌▐▛▚▖▐▌
 ▐▌  █▐▛▀▀▘▐▛▀▘ ▐▛▀▀▘▐▌ ▝▜▌▐▌  █▐▛▀▀▘▐▌ ▝▜▌▐▌     ▐▌        █  ▐▌ ▝▜▌   ▐▌▐▛▀▀▘▐▌     █    █  ▐▌ ▐▌▐▌ ▝▜▌
 ▐▙▄▄▀▐▙▄▄▖▐▌   ▐▙▄▄▖▐▌  ▐▌▐▙▄▄▀▐▙▄▄▖▐▌  ▐▌▝▚▄▄▖  ▐▌      ▗▄█▄▖▐▌  ▐▌▗▄▄▞▘▐▙▄▄▖▝▚▄▄▖  █  ▗▄█▄▖▝▚▄▞▘▐▌  ▐▌
*/


trait Client:
  def post(url: String, body: String): Unit

class DefaultClient extends Client:
  def post(url: String, body: String): Unit =
    // Do the API call
    System.out.println("POST " + url + " body: " + body);


def sendMessage(message: String)(using client: Client) =
  // Do some API call
  client.post("example.com", "Message '" + message + "' sent!")


@main def run =
  given Client = DefaultClient()
  sendMessage("ping")


def test =
  var called = 0
  given Client:
    def post(url: String, body: String): Unit =
      called += 1

  sendMessage("ping")
  assert(called == 1)
