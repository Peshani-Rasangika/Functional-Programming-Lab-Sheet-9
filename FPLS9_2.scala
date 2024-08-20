val result = (x: Int) =>x match {
    case x if (x <= 0) => "Negative/Zero"
    case x if (x % 2 == 0) => "Even Number"
    case x if (x % 2 == 1) => "Odd Number"
}

@main def ls9q2() = {
    println("Enter the number: ")
    val number = scala.io.StdIn.readInt()
    println("The number is: ")
    println(result(number))
}