package sync

import akka.actor.{Actor, ActorLogging}
import bbc.util.Config


/**
  * Recieves message on application startup to begin the data sync process with the items we wish to sync
  */
class DataSyncActor  extends Actor {

  /**
    * Start data sync
    */
  private def sync(): Unit = {
      DataSyncManager.startSync
  }

  private def stop(): Unit = {
      DataSyncManager.stopSync
  }

  override def receive: PartialFunction[Any, Unit] = {
    case "start" => sync()
    case "stop" => stop()
    case message: Any => log.info(message.getClass.getName + " isn't handled by " + this.getClass.getSimpleName)
  }

}