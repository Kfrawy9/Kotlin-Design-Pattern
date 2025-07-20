package org.example.COR.ex1

import COR.Handler

class ServiceTwo: ServiceHandler(){

    override fun handleRequest(requestType: Handler.RequestType, data: Int): String {
        if (requestType == Handler.RequestType.BILL){
            return "Service two handling your data: $data"
        }else
            return successor?.handleRequest(requestType, data) ?: "No handler for your data"
    }
}