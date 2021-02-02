package extension.scope


data class Product(val name:String, val available:Boolean){
	
	fun String.formatName() = toUpperCase()
	
	fun show(){
		 		
		println("Produto: ${name.formatName()} - Dispon�vel: $available")
	}
}

data class Category(val name:String){
	
	fun String.configName() = ">>> ${toUpperCase()}"
	
	fun show(){
		println("Categoria: ${name.configName()}")
	}
}

fun main(){
	
	val product = Product("TV 42 polegadas", true)
	
	val category = Category("TV")
	
	product.show()

	category.show()
}