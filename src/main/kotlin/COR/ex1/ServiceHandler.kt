package org.example.COR.ex1

import COR.Handler

abstract class ServiceHandler {

    internal var successor: ServiceHandler? = null

    public fun setSuccessor(handler: ServiceHandler){
        this.successor = handler
    }

    abstract fun handleRequest(requestType: Handler.RequestType, data: Int): String

}