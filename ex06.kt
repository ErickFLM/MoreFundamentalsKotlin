fun main() {
    val v1 = Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, duration = 0)
    val v2 = Event(title = "Eat breakfast", daypart = Daypart.MORNING, duration = 15)
    val v3 = Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, duration = 30)
    val v4 = Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, duration = 60)
    val v5 = Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, duration = 10)
    val v6 = Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, duration = 45)

    val events = mutableListOf<Event>(v1, v2, v3, v4, v5, v6)
    println(events.toString())

    val shortEvents = events.filter { it.duration < 60 }
    println("Short Events: ${shortEvents.size}.")

    val groupedEvents = events.groupBy { it.daypart }
    groupedEvents.forEach { (daypart, events) ->
    println("$daypart: ${events.size} events")

    println("Last event of the day: ${events.last().title}")
}
}

data class Event(
    val title: String,
    val description: String? = null,
    val daypart: Daypart,
    val duration: Int,
)

enum class Daypart {
    MORNING, AFTERNOON, EVENING,
}