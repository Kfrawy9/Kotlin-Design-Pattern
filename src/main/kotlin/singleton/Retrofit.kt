package singleton

class Retrofit private constructor(){

    companion object{
        private var instance: Retrofit? = null

        fun getInstance(): Retrofit{
             if (instance == null) instance = Retrofit()
            return instance!!
        }

    }


}