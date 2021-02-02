package nullsafety

fun main(){
	
	//Tipo String atribuido através de inferência de tipos
	val name = "Kotlin"
		
	//Tipo String atribuido especificando o tipo da variável
	val address:String = "Avenida"
	
	//Tipo Language atribuido através de inferência de tipos
	val language = Language(1, "Kotlin")
	
	//Tipo Language atribuido especificando o tipo da variável
	val language2:Language = Language(2, "Java")
	
	println("$name - $address - $language - $language2")
}