Matrix myMatrix = new Matrix(4, 4) 
myMatrix.setElement(0, 0, 0)
myMatrix.setElement(1, 1, 0)
myMatrix.setElement(2, 2, 0)
myMatrix.setElement(3, 3, 0)
myMatrix.setElement(0, 3, 4)
myMatrix.setElement(3, 0, 4)
myMatrix.prettyPrint()
if(myMatrix.isSymmetrical()) {
	println "This matrix is Symmetrical"
}
if(myMatrix.isTriangular()) {
	println "This matrix is Triangular"
}
