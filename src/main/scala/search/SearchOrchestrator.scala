package search

object SearchOrchestrator {

	/**
	 * Perform a search given a search term and return pids for matching items
	 */
	def search(term: String): List[String] = {
		SearchDatasource.search(term)
	}

}