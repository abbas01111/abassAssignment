//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//fun main() {
//   println("hello Abass!")
//}

//Create a Kotlin program that asks the user to input their name and age, then prints a greeting like
//fun main() {
//    print("Please enter your name: ")
//    val name = readLine()
//
//    print("Please enter your age: ")
//    val age = readLine()?.toIntOrNull()
//
//    println("Hello, $name! You are $age years old!")
//}

//Write a program that checks if a given number is even or odd.

fun main() {
    print("Enter a number: ")
    val number = readLine()?.toIntOrNull()

    if (number == null) {
        println("Invalid input. Please enter a valid number.")
    } else {
        if (number % 2 == 0) {
            println("$number is an even number.")
        } else {
            println("$number is an odd number.")
        }
    }
}