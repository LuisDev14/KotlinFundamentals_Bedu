const val PI = 3.1416
fun main(){
    println("hola mundo en kotlin")
    val implicitVal = "Variable implicita"

    val explicita: String
    explicita = "Soy una variable explicita"
    println(explicita)
    println(implicitVal.javaClass.kotlin)

    // Números (Numbers)
    val byte: Byte = 127 // 8 bits
    val short: Short = 1234 // 16 bits
    val int: Int = 324 // 32 bits
    val long: Long = 1000000000000 // 64 bits


    val c = 'A'
    println(c.javaClass.kotlin)
    println(c)


    val trueVal = true
    val falseVal = false
    println(trueVal.javaClass.kotlin)
    println(trueVal)
    println(falseVal.javaClass.kotlin)
    println(falseVal)


//reto2
    val decimal = 1.34f
    println(decimal.javaClass.kotlin)
    val perimetro = 2*PI*decimal
    //println(perimetro)
    println("El perimetro del circulo es $perimetro")
}