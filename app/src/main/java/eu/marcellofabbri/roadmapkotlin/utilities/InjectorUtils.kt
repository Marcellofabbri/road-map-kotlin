package eu.marcellofabbri.roadmapkotlin.utilities

import eu.marcellofabbri.roadmapkotlin.data.EventRepository
import eu.marcellofabbri.roadmapkotlin.data.FakeDataBase
import eu.marcellofabbri.roadmapkotlin.ui.events.EventsViewModelFactory

object InjectorUtils {
    fun provideEventsViewModelFactory(): EventsViewModelFactory {
        val eventRepository = EventRepository.getInstance(FakeDataBase.getInstance().eventDao)
        return EventsViewModelFactory(eventRepository)
    }

}