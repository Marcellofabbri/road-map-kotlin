package eu.marcellofabbri.roadmapkotlin.data

class EventRepository private constructor(private val eventDao: FakeEventDao) {

    fun addEvent(event: Event) {
        eventDao.addEvent(event)
    }

    fun getEvents() = eventDao.getEvents()

    companion object{
        @Volatile private var instance: EventRepository? = null

        fun getInstance(eventDao: FakeEventDao) =
            instance ?: synchronized(this) {
                instance ?: EventRepository(eventDao).also { it }
            }
    }
}