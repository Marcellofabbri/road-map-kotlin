package eu.marcellofabbri.roadmapkotlin.ui.events

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import eu.marcellofabbri.roadmapkotlin.data.EventRepository

class EventsViewModelFactory(private val eventRepository: EventRepository) : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return EventsViewModel(eventRepository) as T
    }
}