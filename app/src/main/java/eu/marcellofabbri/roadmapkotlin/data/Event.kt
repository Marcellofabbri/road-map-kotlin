package eu.marcellofabbri.roadmapkotlin.data

import java.util.*

data class Event(val description: String,
                 val start: Date) {
    override fun toString(): String {
        return "$description - ${start.toString()}"
    }
}