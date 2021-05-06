fun main(){
introduction("constance",19)
    machineDispenser(6)
    machineDispenser(10)
    machineDispenser(29)
    var people=Names("Jacky","Racheal","Asi","Lulu")
    println(people)
    calculations()
    division()
    modulation()

}
fun introduction(name:String,age:Int){
    var name="Constance"
    var age=19
    println("My name is $name and Iam $age years old" )

}
fun machineDispenser(age:Int) {
    if (age <= 6) {
        println("serve milk")
    } else if (age <= 15 && age > 6) {
        println("serve a bottle of fanta ")
    } else {
        println("serve cocacola")
    }
}
fun Names(names1:String,names2:String,names3:String,names4:String) :Int {

    var name = arrayOf(names1, names2, names3, names4)
    var collect = 0;
    for (name in name) {
        if (name.length >= 4)
            collect++
    }
    return collect
}
fun calculations() {
    var a = 20;
    var b = 30;
    var multiply = a * b
    println(multiply)
}
    fun  division(){
        var x=4
        var y=2
        var devide = x/ y
        println(devide)
    }
fun modulation(){
    var k=20
    var j=10
    var modulus=k%j
    println(modulus)
}
class Human(names:String,age:String,weight:Float){
    fun eat(foodWeight:Int){
        println("Iam eating{}of food")


    }
}
