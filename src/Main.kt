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

//fun main() {
//    print("Enter a number: ")
//    val number = readLine()?.toIntOrNull()
//
//    if (number == null) {
//        println("Invalid input. Please enter a valid number.")
//    } else {
//        if (number % 2 == 0) {
//            println("$number is an even number.")
//        } else {
//            println("$number is an odd number.")
//        }
//    }
//}


//Print numbers from 1 to 10 using a for loop. Then, print only even numbers from 1 to 20.
//fun main() {
//    // Print numbers from 1 to 10
//    println("Numbers from 1 to 10:")
//    for (i in 1..10) {
//        print("$i ")
//    }
//    println()
//
//    // Print even numbers from 1 to 20
//    println("Even numbers from 1 to 20:")
//    for (i in 1..20) {
//        if (i % 2 == 0) {
//            print("$i ")
//        }
//    }
//    println()
//}



//Write a function sum(a: Int, b: Int): Int that returns the sum of two numbers. Call it with different values and display the result.
/*fun sum(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    // Call sum with different values and display results
    println("Sum of 6 and 4: ${sum(6, 4)}")
    println("Sum of 9 and 20: ${sum(9, 20)}")

}*/




//Create an array of 5 names. Loop through the array and print each name with a greeting.
//fun main() {
//    val names = arrayOf("Abass", "Ibrahim", "Darma", "tijani", "Suraj")
//
//    for (name in names) {
//        println("Hello, $name")
//    }
//}


// Define a class Car with properties brand, model, and year. Add a function displayDetails() that prints the car details. Create at least two objects of this class.
class Car(val brand: String, val model: String, val year: Int) {
    fun displayDetails() {
        println("Car Details: $year $brand $model")
    }
}

fun main() {
    // Creating two Car objects
    val car1 = Car("Toyota", "Camry", 2020)
    val car2 = Car("Honda", "Civic", 2018)

    // Displaying details for both cars
    car1.displayDetails()
    car2.displayDetails()
}
