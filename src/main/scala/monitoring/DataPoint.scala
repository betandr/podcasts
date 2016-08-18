package monitoring

case class DataPoint(
  key: String
  tags: List[String]
  field: String
  timestamp: String
)