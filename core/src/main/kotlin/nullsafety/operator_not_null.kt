package nullsafety

fun showMessageSize(str:String){
	
	println("A mensagem possui ${str.length} caracteres")
}

fun main(){
	
	val message1 = "Kotlin para Backend"
	
	showMessageSize(message1)
	
	val message2:String? = "Programando em Kotlin"
	
	showMessageSize(message2!!)
	
	val message3:String? = null
	
	showMessageSize(message3!!)
}