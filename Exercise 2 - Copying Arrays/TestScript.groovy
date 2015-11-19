ArrayCopier myArrayCopier = new ArrayCopier()

//Both array are of the same size
int[] array1 = new int[6]
array1[0] = 10
array1[1] = 20
array1[2] = 30
array1[3] = 40
array1[4] = 50
array1[5] = 60
int[] array2 = new int[6]
array2[0] = 1
array2[1] = 2
array2[2] = 3
array2[3] = 4
array2[4] = 5
array2[5] = 6
myArrayCopier.copy(array1, array2)
println "Array 1"
for(int index = 0; index < array1.length; index++) {
	println array1[index];
}
println "Array 2"
for(int index = 0; index < array2.length; index++) {
	println array2[index];
}

//source array is longer
int[] array3 = new int[3]
array2[0] = 1
array2[1] = 2
array2[2] = 3
myArrayCopier.copy(array1, array3)
println "Array 1"
for(int index = 0; index < array1.length; index++) {
	println array1[index];
}
println "Array 3"
for(int index = 0; index < array3.length; index++) {
	println array3[index];
}

//source array is shorter
myArrayCopier.copy(array3, array1)
println "Array 3"
for(int index = 0; index < array3.length; index++) {
	println array3[index];
}
println "Array 1"
for(int index = 0; index < array1.length; index++) {
	println array1[index];
}