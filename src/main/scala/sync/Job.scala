package sync

import package java.util.Date

case class Job(
	createdAt: Date,
	lifetimeInMillis: Int,
	type: String,
	id: String
)