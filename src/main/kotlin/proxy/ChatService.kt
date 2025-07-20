package org.example.proxy

import java.beans.Encoder
import java.nio.charset.CharsetEncoder
import java.util.Base64

interface ChatService {

    fun sendMessage(text: ByteArray)
    fun getMessage(): String

}

class DefaultChatService(): ChatService{
     var message: ByteArray = byteArrayOf()
    override fun sendMessage(text: ByteArray) {
       // send it to network
        message = text
    }

    override fun getMessage(): String {
        return ""
    }
}

class ProxyChatService(val encoder: Base64.Encoder): ChatService{
    private val chatService: DefaultChatService = DefaultChatService()
    override fun sendMessage(text: ByteArray) {
        val encodedText = encoder.encode(text)
    }

    override fun getMessage(): String {
        val message = encoder.encodeToString(chatService.message)
        return message
    }
}
