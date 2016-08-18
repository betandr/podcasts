package app

import akka.actor.Actor

class Service extends Actor {

  val pid = """[0-9|b-d|f-h|j-n|p-t|v-z]{8,}""".r

  val routes = 
    path("podcasts" / pid ~ ".json") { pid =>
      get {
          PodcastsOrchestrator.podcast(pid)
        }
      }
    } ~ path("podcasts.json") {
      get {
        parameters('pids.as[String] ) { (pids) =>
          PodcastsOrchestrator.podcasts(pids)
        }
      }
    }

  def receive: Receive = runRoute(routes)
}