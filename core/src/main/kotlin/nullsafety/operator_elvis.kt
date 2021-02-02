package nullsafety

data class Car(val name:String, val value:Double?)

fun main(){
	
	//Instancia e value com valores
	val car1 = Car("BMW", 20000.00)
	
	val result1 = car1.value ?: "Não tem valor definido."
	
	println("Car1 tem o valor: $result1")
	
	//Instancia com value null
	val car2 = Car("Audi", null)
	
	val result2 = car2.value ?: "Não tem valor definido."
	
	println("Car2 tem o valor: $result2")
	
	//Instancia null
	val car3:Car? = null
	
	val result3 = car3?.value ?: "Não tem valor definido."
	
	println("Car3 tem o valor: $result3")
}