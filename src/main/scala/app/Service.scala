package app

import akka.actor.Actor

class Service extends Actor {

  val pid = """[0-9|b-d|f-h|j-n|p-t|v-z]{8,}""".r

  val routes = 
    path("podcasts" / pid ~ ".json") { pid =>
      get {
        respondWithMediaType(`application/json`) {
          PodcastsOrchestrator
        }
      }
    } ~ path("podcasts.json") {
        respondWithMediaType(`application/json`) {
        }
    }

  def receive: Receive = runRoute(routes)
}