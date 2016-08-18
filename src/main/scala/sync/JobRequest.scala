package sync

case class JobRequest(
	type: String,
	id: String,
	status: Status
)