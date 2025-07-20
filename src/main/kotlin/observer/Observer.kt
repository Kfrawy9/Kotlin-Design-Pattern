package observer

interface Observer {

    val subject: Subject
    fun update(state: String)

}