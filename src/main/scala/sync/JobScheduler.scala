package sync

/**
 * Represents the actor which runs periodically to check for job requests to run
 */
class JobScheduler extends Actor{
  def receive = {
    case "find-jobs" => { /* find jobs here*/ }
  }
}