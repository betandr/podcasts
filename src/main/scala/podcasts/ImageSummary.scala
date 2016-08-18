package podcasts

case class ImageSummary(
	`type`: String = "image_summary",
	id: String,
	url: String,
	image_type: String
)