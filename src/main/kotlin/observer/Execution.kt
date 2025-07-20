package observer

fun main() {

    val subject = ConSubject()
    val ob1 = ConObserver(subject, "observer one")
    val ob2 = ConObserver(subject, "observer two")
    val ob3 = ConObserver(subject, "observer three")
    val ob4 = ConObserver(subject, "observer four")

    subject.setState("Loading State")



}