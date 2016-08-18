package sync

object JobManager {
	// The lookup table for the weightings
	val weightings = Map("podcast" -> 3)


	def findJobsToRun(jobRequests: List[JobRequest], jobs: List[Job]): List[jobRequests] = {}

	/**
	 * Get the next available execution time for a particular job
	 */
	def getNextAvailableExecutionTime(job: Job): Long = {
		ExecutionTimePoolManager.findNextSlot(weightings.getOrElse(job.type, 2))
	}

	/**
	 * Create a job request for a particular type with an id
	 */
	def createJobRequest(`type`: String, id: String): JobRequest = {}

	/**
	 * Get all of the current job requests
	 */
	def getJobRequests: List[JobRequests] = {}

	/**
	 * Get all of the current jobs
	 */
	def getJobs: List[Jobs] = {}

	/**
	 * Create a new job
	 */
	def createJob: Job = {}