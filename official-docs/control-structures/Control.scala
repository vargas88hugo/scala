object Control extends App {

       /**
        * Scala’s if/else control structure is similar to other
	* languages
	*/
       var x = 5

       if (x > 5) {
       	  println("The value is greater than 5")
       } else if (x == 5) {
       	 println("The value is equal to 5")
       } else {
       	 println("Something unexpected")
       }

       val y = if (x <= 5) true else false

       println("The value of y is: " + y) // The value of y is 5

       /**
        * The match expression isn’t limited to just integers,
	* it can be used with any data type, including booleans
	*/
       var result = x match {
       	   case 1 => "one"
	   case 2 => "two"
	   case 3 => "three"
	   case 4 => "four"
	   case 5 => "five"
	   case 6 => "six"
	   case _ => "None of the above"
       }

       println(result) // five

       /**
        * Here’s an example of match being used as the body of a method,
	* and matching against many different types
	*/
       def getClassAsString(x: Any): String = x match {
       	   case 1 => "one"
	   case 2 => "two"
	   case 3 => "three"
	   case 4 => "four"
	   case 5 => "five"
	   case 6 => "six"
	   case _ => "None of the above"       
       }

       println(getClassAsString(x)) // five

       /**
        * Try Catch Exceptions
	*/
       try {
       	   val divide = 11 / 0
       } catch {
       	   case x: ArithmeticException => println("Divided by zero?")
       }

       /**
        * Scala for loops
	*/
       var fruits = List("apple", "banana", "lime", "orange", "cherry")

       for (fruit <- fruits) println(fruit)
       println()

       for (i <- 0 to 2) println(i)
       println()

       for (i <- 0 to 5 by 2) println(i)
       println()

       // You can also add the yield keyword to for-loops to
       // create for-expressions that yield a result. Here’s a
       // for-expression that doubles each value in the sequence 1 to 5:

       val fruitLengths = for {
       	   f <- fruits
       } yield f.length
       println(fruitLengths)

       var i = 0
       while (i < 3) {
       	     print(i)
	     i += 1
       }
}