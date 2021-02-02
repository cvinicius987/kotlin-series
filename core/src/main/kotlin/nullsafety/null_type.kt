package nullsafety

fun main(){
	
	/*
 	 * Tipo val definido como String?
     * Declarado logo na inicialização
     * Vale lembrar que val não ter sua referencia alterada após o valor ser declarado
     */
	val name:String? = "Kotlin"
	
	println(name)
	
	/*
 	 * Tipo val definido como Double?
     * Na declaração setamos o tipo, mas não atribuimos o valor
     * Atribuimos o valor posteriormente
     * Vale lembrar que val não ter sua referencia alterada após o valor ser declarado
     */
	val money:Double?
	
	money = 100.50
	
	println(money)
	
	//Tipo var pode ter seu valor ao alterado
	var age:Int?
	
	age = 30
	
	println(age)
	
    //Tipo var pode ter seu valor ao alterado
	var year:Int? = null
	
	year = 2021
	
	println(year)
}