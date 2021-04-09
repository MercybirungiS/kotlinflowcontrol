fun main() {
    data()
    origin()
    national()
    selectContainer(16)
    programming()
    programming()
}
fun data(){
    val age=18
    if (age>10){
        println("You are now an adult")
    }
    else{
        println("You are underage ")
    }
}
fun origin(){
    var nationality="Sudan"
    if(nationality=="Kenyan"){
        println ("Have you been to Nairobi")
    }
    else if (nationality=="Congolese"){
        println ("Have you been to Kinshasha")
    }
    else if (nationality=="Ugandan")
        println("Have you been to Kampala")
    else{
        println("Which capital city have you been to in Africa?")
    }
}
fun national(){
    var origin = "Rwanda"
    when(origin){
        "Uganda"-> println("Have you ever been to Kampala?")
        "Rwanda"-> println("Have you ever been to Kigali?")
        "Kenya"-> println("Have you ever been to Nairobi?")
        else-> println("Have you ever been to East Africa?")
}
}
fun selectContainer(litres: Int){
    when(litres){
        2,4,5-> println("Pour the water into a bottle")
        6,8,10,12-> println("Pour the water into a bucket")
        14,16,18 -> println("Pour the water into a big bucket")
        else-> println("Pour the water into a jerrycan")
    }
}
fun programming() {
    var languages = arrayOf("Kotlin", "Python", "Java", "Ruby")
    for (language in languages) {
        println(language)
    }
    var name = "Alexandra"
    for (character in name) {
        println(character)
    }
}