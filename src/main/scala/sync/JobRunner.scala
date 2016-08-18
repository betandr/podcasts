package sync

import scala.concurrent.duration._
import akka.actor.Actor
import bbc.persistence.sync.Job


/**
  * AKKA Scheduler Actor which will execute the anonymous function 'callback()' after the job.lifetimeInMills has elapsed
  */
class JobRunner(job: Job, callback: () => Unit) extends Actor {
    import context.dispatcher

    val tick = context.system.scheduler.scheduleOnce(
      job.lifetimeInMillis milliseconds,
      self,
      "run-job"
    )

    override def postStop() = tick.cancel()

    def receive = {
      case "run-job" => {
        
        val result = callback()
        Monitor.monitor(resultToDataPoint(result))
      }
    }

    private def resultToDataPoint(result: Any): DataPoint = {
      // convert the result return to a DataPoint
    }
}