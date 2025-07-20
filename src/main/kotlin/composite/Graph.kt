package org.example.composite

interface Graph {
    fun draw(): String
}

class Circle(private val x: Int, private val y: Int, private val radius: Int): Graph{
    override fun draw(): String {
        return "Circle $x, $y, $radius"
    }
}

class Dot(private val x: Int, private val y: Int): Graph{
    override fun draw(): String {
        return "Dot $x, $y"
    }
}

class CompoundGraph(): Graph{
    private val graphList: MutableList<Graph> = mutableListOf()

    fun addGraph(graph: Graph){
        graphList.add(graph)
    }

    fun deleteGraph(graph: Graph){
        graphList.remove(graph)
    }

    override fun draw(): String {
        val stringBuilder = StringBuilder()
        graphList.forEach {
            stringBuilder.appendLine(it.draw())
        }
        return stringBuilder.toString()
    }
}

fun main() {

    val circle = Circle(1,2,30)
    val dot = Dot(2,4)
    val compound = CompoundGraph()
    compound.addGraph(circle)
    compound.addGraph(dot)

    println(compound.draw())

}