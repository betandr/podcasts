package podcasts

object PodcastsOrchestrator {
  val dataSource: PodcastsDataSource

  /**
	 * Return a single podcast given a programme id
	 * @pid The programme ID
	 */
  def podcast(pid: String): Future[Podcast] = {
  	dataSource.podcast(pid)
  }

  /**
	 * Return a single podcast given a list of pids
	 * @pids A List of programme IDs
	 */
  def podcasts(pids: List[String]): Future[List[Podcasts]] = {
    dataSource.podcasts(pids)
  }

}