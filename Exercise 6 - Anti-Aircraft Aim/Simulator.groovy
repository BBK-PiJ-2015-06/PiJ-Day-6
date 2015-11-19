print "Please enter an integer for the size of space to be created: "
String str = System.console().readLine()
int size = Integer.parseInt(str)
Target myGame = new Target(size)
println "Simulator starting..."
boolean playAgain = true
while(playAgain) {
	println "Here they come! Try to bring the plane down!"
	boolean gameFinished = false
	while(!gameFinished) {
		print "Enter a coordinate X: "
		str = System.console().readLine()
	}
	print "Would you like to play again? (y or n)"
	str = System.console().readLine()
	if(str == "n") {
		playAgain = false
	}
}
