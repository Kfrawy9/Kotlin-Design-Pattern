package COR

class CustomerHandler(val requestType: Handler.RequestType): Handler(requestType) {

    override fun handleRequest(data: String): String {
        return "Customer support handling: $data"
    }
}