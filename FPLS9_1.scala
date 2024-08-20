val calculateInterest = (x: Int) => {
    if(x <= 20000){
        0.02*x
    }else if(x <= 200000){
        0.04*x
    }else if(x <= 2000000){
        0.035*x
    }else{
        0.065*x
    }
}

@main def ls9q1() = {
    println("Enter the deposit amount: ")
    val amount = scala.io.StdIn.readInt()
    println("Interest is: ")
    println(calculateInterest(amount))
}