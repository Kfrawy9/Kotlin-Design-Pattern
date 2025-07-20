package observer

class ConSubject: Subject() {

    var subState: String = ""

    override fun setState(state: String) {
        this.subState = state
        notifyObserver()
    }

    override fun getState(): String = subState

/*    var states: String = ""
        get() = ""
        set(value){
            field = value
            notify()
        }

*/
}