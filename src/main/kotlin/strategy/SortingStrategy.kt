package org.example.strategy

sealed interface SortingStrategy {

    object BubbleSort: SortingStrategy {
        override fun sort(number: List<Int>): List<Int> {
            TODO("implement bubble sort here")
        }
    }

    object InsertionSort: SortingStrategy {
        override fun sort(number: List<Int>): List<Int> {
            TODO("implement insertion sort here ")
        }
    }

    object QuickSort: SortingStrategy {
        override fun sort(number: List<Int>): List<Int> {
            TODO("implement quick sort here")
        }
    }

    fun sort(number: List<Int>): List<Int>
}
