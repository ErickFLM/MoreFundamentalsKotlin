fun main() {
    val v1 = Event("Study Kotlin", "Commit to studying Kotlin at least 15 minutes per day.", "Evening", 15)
    println(v1.toString())
}

data class Event(
    val title: String,
    val description: String? = null,
    val daypart: String,
    val duration: Int,
)