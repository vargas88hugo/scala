object Type extends App {
       /**
        * val is an immutable variable — like final in Java — and should be preferred
	* var creates a mutable variable, and should only be used when there is a specific reason to use it
 	*/
       val x = 1   //immutable
       var y = 0   //mutable

       println(x, y)

       /**
        * In Scala, you typically create variables without declaring their type:
        * val x = 1
        * val s = "a string"
        * val p = new Person("Regina")
	*/
}