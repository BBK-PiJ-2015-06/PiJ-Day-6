print "Please enter an integer for the size of space to be created: "
String str = System.console().readLine()
int size = Integer.parseInt(str)
println "X and Y coordinates - horizontal plane"
println "Z coordinate - vertical plane"
Target myGame = new Target(size)
println "Simulator starting..."
boolean playAgain = true
while(playAgain) {
	println "Here they come! Try to bring the plane down!"
	myGame.init()
	boolean gameFinished = false
	while(!gameFinished) {
		print "Enter a coordinate X: "
		String xCoordinate = System.console().readLine()
		int x = Integer.parseInt(xCoordinate)
		print "Enter a coordinate Y: "
		String yCoordinate = System.console().readLine()
		int y = Integer.parseInt(yCoordinate)
		print "Enter a coordinate Z: "
		String zCoordinate = System.console().readLine()
		int z = Integer.parseInt(zCoordinate)
		Result attempt = myGame.fire(x, y, z)
		switch(attempt) {
			case Result.HIT:
				println "You hit it! Well done!"
				gameFinished = true
				break;
			case Result.FAIL_LEFT:
				println "You missed! The target is to the left!"
				break;
			case Result.FAIL_RIGHT:
				println "You missed! The target is to the right!"
				break;
			case Result.FAIL_HIGH:
				println "You missed! The target is higher!"
				break;
			case Result.FAIL_LOW:
				println "You missed! The target is lower!"
				break;
			case Result.FAIL_SHORT:
				println "You missed! The target is nearer!"
				break;
			case Result.FAIL_LONG:
				println "You missed! The target is farther"
				break;
			case Result.OUT_OF_RANGE:
				println "That shot is way out of range. Try harder!"
				break;
			case Default:
				break;
		}
	}
	print "Would you like to play again? (y or n)"
	str = System.console().readLine()
	if(str == "n") {
		playAgain = false
	}
}
