package factory

interface Product{

    // you can create a factory inside the product interface
    companion object{
        fun createProduct(char: Char): Product{
            return when(char){
                'A' -> ProductA()
                'B' -> ProductB()
                'C' -> ProductC()
                else -> ProductA()
            }
        }
    }

    fun make()
    fun details()
}

class ProductA: Product{
    override fun make() {
        TODO("Not yet implemented")
    }

    override fun details() {
        TODO("Not yet implemented")
    }
}

class ProductB: Product{
    override fun make() {
        TODO("Not yet implemented")
    }

    override fun details() {
        TODO("Not yet implemented")
    }
}

class ProductC: Product{
    override fun make() {
        TODO("Not yet implemented")
    }

    override fun details() {
        TODO("Not yet implemented")
    }
}