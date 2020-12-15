package extension.property

import java.util.regex.Pattern

val User.emailValid:Boolean
get(){
	val pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE)

    return pattern.matcher(this.email).find()
}
	
data class User(val email:String)

fun main(){

	val user1 = User("kotlin@kotlin.com")
	val user2 = User("kotlin.com")
		
	println(user1.emailValid)
	println(user2.emailValid)
}