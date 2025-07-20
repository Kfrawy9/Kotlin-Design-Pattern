package org.example.facade

class ByteReader {

    fun read(fileName: String): ByteArray{
        return byteArrayOf()
    }

    fun getExtension(fileName: String): String{
        return ""
    }

}

interface Compressor{
    fun compress(byte: ByteArray):ByteArray
}

class PngCompressor(): Compressor{
    override fun compress(byte: ByteArray): ByteArray{
        TODO("Not yet implemented")
    }
}

class SvgCompressor(): Compressor{
    override fun compress(byte: ByteArray): ByteArray {
        TODO("Not yet implemented")
    }
}

class GifCompressor(): Compressor{
    override fun compress(byte: ByteArray) : ByteArray{
        TODO("Not yet implemented")
    }
}

class ImageFacade(){
    fun convert(fileName: String): ByteArray{
        val reader = ByteReader()
        val bytes = reader.read(fileName)
        val extension = reader.getExtension(fileName)
        return when(extension){
            "Png"-> PngCompressor().compress(bytes)
            "gif"-> GifCompressor().compress(bytes)
            "svg"-> SvgCompressor().compress(bytes)
            else -> {return PngCompressor().compress(bytes)}
        }

    }
}
