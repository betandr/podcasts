package podcasts

case class Podcast(
	id: String,
	`type`: String = "podcast",
	entityType: String,
	title: String,
	image: ImageSummary,
	categories: List[String],
	frequency: String,
	daysAvailable: Int,
	territory: String
)