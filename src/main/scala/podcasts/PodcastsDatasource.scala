package podcasts

import scala.concurrent.Future

object PodcastsDatasource {

	/**
	 * Return a single podcast given a programme id
	 * @pid The programme ID
	 */
  def podcast(pid: String): Future[Podcast] = {}

  /**
	 * Return a single podcast given a list of pids
	 * @pids A List of programme IDs
	 */
  def podcasts(pids: List[String]): Future[List[Podcast]] = {}
}