package nullsafety

data class Language(val id:Long, val name:String)

fun main(){
	
	val client = Language(1, "Kotlin")
	
	val client2:Any = Language(2, "Java")
		
	println(client)
	println(client2)
}