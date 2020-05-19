package eu.marcellofabbri.roadmapkotlin.data

class FakeDataBase private constructor() {

    var eventDao = FakeEventDao()
    private set

    companion object{
        @Volatile private var instance: FakeDataBase? = null

        fun getInstance() =
            instance ?: synchronized(this) {
                instance ?: FakeDataBase().also { it }
            }
    }
}