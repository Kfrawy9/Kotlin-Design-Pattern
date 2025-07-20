package COR

abstract class Handler(val request: RequestType) {

    enum class RequestType{
        TECHNICAL, BILL, CUSTOMER_SATISFACTION, UNKNOWN,
    }

    open var nextHandler: Handler ?= null

    open fun receiveRequest(type: RequestType, data: String): String{
        if (this.request == type)
            return handleRequest(data)
        else
            return nextHandler?.receiveRequest(type, data) ?: "No handler for your request"
    }

    abstract fun handleRequest(data: String): String


}