
package infix

data class Computer(val itens:List<String>)

infix fun Computer.hasItem (item:String) = this.itens.contains(item)

fun main() {
    
	val computer = Computer(listOf("Teclado", "Mouse", "Monitor"))
	
	//Chamada Tradicional
	val result = computer.hasItem("Teclado")
	
	//Chamada usando o recurso do modificador infix
	val resultInfix = computer hasItem "Teclado"
	
	println(result)
	println(resultInfix)
}