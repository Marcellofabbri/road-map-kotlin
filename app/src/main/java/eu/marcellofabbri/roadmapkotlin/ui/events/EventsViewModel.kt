package eu.marcellofabbri.roadmapkotlin.ui.events

import androidx.lifecycle.ViewModel
import eu.marcellofabbri.roadmapkotlin.data.Event
import eu.marcellofabbri.roadmapkotlin.data.EventRepository

class EventsViewModel(private val repository: EventRepository) : ViewModel() {

    fun getEvents() = repository.getEvents()

    fun addEvent(event: Event) = repository.addEvent(event)
}