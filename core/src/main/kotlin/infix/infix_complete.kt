package infix

data class Product(val name:String, val category:Category)

data class Category(val name:String){
		
	infix fun product(name:String) = Product(name, this)
}

class Store{
	
	infix fun addCategory(name:String) = Category(name)
}

fun main(){
	
	val store = Store()
	
	val productInfix = store addCategory "Eletrônicos" product "TV"
	
	println("productInfix = $productInfix")
	
	val productWithoutInfix = store.addCategory("Eletrônicos").product("TV")
	
	println("productWithoutInfix = $productWithoutInfix")
}