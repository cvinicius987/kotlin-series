package extension.function

import java.util.UUID

fun main() {
    
    val strUuid = "58365b4b-5186-4a32-acf8-4e0ffa70afc5"
    
    val uuid = UUID.fromString(strUuid)
    
    println(uuid)
}