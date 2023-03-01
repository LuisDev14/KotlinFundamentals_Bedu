fun main(){
    val a = 10
    val b = 5

    var result:Int
    //result = a+b
    result = a.plus(b)
    println(result)

    println(a.plus(b))
    println(a.minus(b))
    println(a.times(b))
    println(a.div(b))
    println(a.rem(b))
    println(a.rangeTo(b))

    //Incremental/decremental
    var c = 23
    c++
    println(c)
    c--
    println(c)

    var d = 3

    d+=b // d = 3+5  = 8
    println(d)
    d-=b // d = 8 - 5 = 3
    println(d)
    d*=b // d = 3 * 5 = 15
    println(d)
    d/=b // d = 15 / 5 = 3
    println(d)

    println("----------------------------------------------")
    val m = 43
    val x = 43
    println(m>x)
    println(m.compareTo(x))


}