package observer

abstract class Subject(){

    private val observers: MutableList<Observer> = ArrayList()

    abstract fun setState(state: String)
    abstract fun getState(): String

    fun addObserver(observer: Observer){
        observers.add(observer)
    }
    fun removeObserver(observer: Observer){
        observers.remove(observer)
    }
    fun notifyObserver(){
        observers.forEach { observer ->
            observer.update(getState())
        }
    }

}