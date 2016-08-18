package persistence.cache

object NitroDao {

	/**
	 * Return a Nitro programme given a programme ID
	 */
	def programme(pid: String): NitroProgramme = {}

	/**
	 * Return a collection of Nitro programmes given a collection of programme ID
	 */
	def programmes(pids: List[String]): List[NitroProgramme] = {}

}