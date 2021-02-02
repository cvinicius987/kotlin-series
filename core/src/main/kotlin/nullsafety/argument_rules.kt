package nullsafety

data class Book(val id:Int, val name:String)

fun showBook(book:Book) = println(" O livro é ${book.name}")

fun showBookOrMessage(book:Book?){
	
	val result = book?.let{
		" O livro é ${it.name}"
	} ?: "Livro não existe"
	
	println(result)
}

fun main(){
	
	val book = Book(1, "Kotlin em Ação")
	
	showBook(book)
	showBookOrMessage(book)
	
	val book2:Book? = null
	
	//Erro de Compilação
	//showBook(book2)
	
	showBookOrMessage(book2)
}