package COR

class BillHandler(val requestType: Handler.RequestType): Handler(requestType){

    override var nextHandler: Handler? = CustomerHandler(RequestType.CUSTOMER_SATISFACTION)
    override fun handleRequest(data: String): String {
        return "Bill support handling: $data"
    }
}