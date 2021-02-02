package nullsafety

fun main(){
	
	val name:String? = "Kotlin"
	
	println(name?.toUpperCase())
	
	val age:Int? = null
	
	println(age?.toBigDecimal())
}