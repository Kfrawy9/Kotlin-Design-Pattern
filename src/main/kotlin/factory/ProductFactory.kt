 package factory

interface ProductFactory {
    fun createProduct(char: Char): Product
}

class ProductFactoryImpl: ProductFactory{
    override fun createProduct(char: Char): Product {
        return when(char){
            'A' -> ProductA()
            'b' -> ProductB()
            'C' -> ProductC()
            else -> ProductA()
        }
    }
}

class createFactoryFromCompanion{
    companion object: ProductFactory{
        override fun createProduct(char: Char): Product {
            return when(char){
                'A' -> ProductA()
                'B' -> ProductB()
                'C' -> ProductC()
                else -> ProductA()
            }
        }
    }
}

// or by object
object ProductObject: ProductFactory{

    override fun createProduct(char: Char): Product {
        return when(char){
            'A' -> ProductA()
            'B' -> ProductB()
            'C' -> ProductC()
            else -> ProductA()
        }
    }
}