package org.example.iterator

import org.example.iterator.Iterator
import java.util.Objects

class StudentInfo: Iterator {

    val studentList = ArrayList<String>()
    private var index: Int = 0
    init {
        studentList.add("Ahmed")
        studentList.add("Mohamed")
        studentList.add("Ali")
    }

    fun addStudentName(name: String){
        studentList.add(name)
    }


    override fun hasNext(): Boolean {
        return index < studentList.size
    }

    override fun next(): String {
        return studentList[index++]
    }
}

fun main() {
    val si = StudentInfo()
    si.studentList.forEach {
        println(it)
    }
}