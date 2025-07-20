package org.example.COR.ex1

import COR.Handler

class ServiceOne: ServiceHandler() {

    override fun handleRequest(type: Handler.RequestType, data: Int): String {
        if (type == Handler.RequestType.TECHNICAL){
            return  "Service One is handling your data: $data"
        }else
            return successor?.handleRequest(type, data) ?: "No Handler for this data"
    }
}