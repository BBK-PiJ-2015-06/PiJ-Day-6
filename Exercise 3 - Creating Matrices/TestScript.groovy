Matrix myMatrix = new Matrix(5, 6)
myMatrix.setElement(4, 5, 4)
myMatrix.setElement(0, 0, 9)
myMatrix.setElement(2, 3, 32)
myMatrix.setRow(1, "10,20,30,40,50,60")
myMatrix.setColumn(5, "8,8,8,8,8")
String str = myMatrix.toString()
println str
myMatrix.prettyPrint()