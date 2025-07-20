package observer

class ConObserver(val sub: Subject, val className: String) : Observer {

    // this instance of subject is optional
    // this instance for update the subject from observer and add the observer
    // but you can add it from .addObserver() and put the observer object from outside of this class
    override val subject: Subject
        get() = sub

    init {
        subject.addObserver(this)
    }

    // if you want the observer to update the subject make a function to update it here
    fun updateSubject(subState: String){
        // and that is why we create an instance of the subject here
        subject.setState(subState)
    }

    override fun update(state: String) {
        println("$className received the state from subject and the state now is: $state")

    }
}