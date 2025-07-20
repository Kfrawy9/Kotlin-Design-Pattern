package COR

class TechnicalHandler(val type: Handler.RequestType): Handler(type)
{

    override var nextHandler: Handler? = BillHandler(RequestType.BILL)

    override fun handleRequest(data: String): String {
        return "Technical support handling: $data"
    }
}