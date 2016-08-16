package podcasts

object PodcastsOrchestrator {
  val dataSource: PodcastsDataSource

  def podcast(pid: String): Future[Podcast] = {

  }

  def podcasts(pids: List[String]): Future[List[Podcasts]] = {
    
  }

}