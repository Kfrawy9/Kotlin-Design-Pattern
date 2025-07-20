import COR.Handler
import COR.SupportClient
import org.example.COR.ex1.ServiceOne
import org.example.COR.ex1.ServiceTwo
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class COR {


    @Test
    fun `support center attempt to process technical request`(){
        val support = SupportClient.technical
            .receiveRequest(Handler.RequestType.TECHNICAL, "tech data")

        assertEquals("Technical support handling: tech data", support)
    }

    @Test
    fun `support center attempt to process customer client request`(){
        val support = SupportClient.technical
            .receiveRequest(Handler.RequestType.CUSTOMER_SATISFACTION, "customer data")

        assertEquals("Customer support handling: customer data", support)
    }

    @Test
    fun `services attempt to process customer request`(){
        val support = ServiceOne()
        support.setSuccessor(ServiceTwo())
        val result = support.handleRequest(Handler.RequestType.BILL, 123)

        assertEquals("Service two handling your data: 123", result)
    }

}