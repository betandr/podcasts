package app

object Boot extends App {
  val dataSync = system.actorOf(Props[DataSyncActor], "data-sync")
  dataSync ! "start"
}