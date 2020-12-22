package infix

data class Car(val name:String){
	
	infix fun nameStartsWith(letter:Char) = this.name.startsWith(letter)
}

fun main() {
    
	val car = Car("Azera")
	
	//Chamada Tradicional
	val result = car.nameStartsWith('B')
	
	//Chamada usando o recurso do modificador infix
	val resultInfix = car nameStartsWith 'A'
	
	println(result)
	println(resultInfix)
}