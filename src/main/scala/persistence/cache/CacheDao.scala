package persistence.cache

object CacheDao {

	/**
	 * Put an item of type T into the cache
	 */
	put[T](key: String, item: T) = {}

	/**
	 * Get an item of type T from the cache
	 */
	get[T](key: String): T = {}
}