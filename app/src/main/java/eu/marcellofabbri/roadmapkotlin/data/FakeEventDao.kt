package eu.marcellofabbri.roadmapkotlin.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class FakeEventDao {
    private val eventList = mutableListOf<Event>()
    private val events = MutableLiveData<List<Event>>()

    init {
        events.value = eventList
    }

    fun addEvent(event: Event) {
        eventList.add(event)
        events.value = eventList
    }

    fun getEvents() = events as LiveData<List<Event>>
}