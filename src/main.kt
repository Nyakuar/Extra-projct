fun main(){
    school()
    var rem=modulus(77, 24)
    println(rem)
    var x = City("Nairobihome")
    println(x)

}

fun school(){
    var name="CodeHive"
    var x = name[4].toString()+name[5]+name[6]+name[7]
    println(x)
    myname("Nyakuar",22)


}

fun modulus(num1: Int, num2: Int):Int{
    var nums= num1% num2
    return(nums)
}

fun myname(name: String, age: Int){
    println("Hi, my name is $name and i am $age years old")
    }

fun City(name: String){
    println(name.length)

}
