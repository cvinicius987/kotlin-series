package extension.function

import java.util.UUID

fun String.toUuid() = UUID.fromString(this)

fun main() {
    
    val strUuid = "58365b4b-5186-4a32-acf8-4e0ffa70afc5"
    
    println(strUuid.toUuid())
}