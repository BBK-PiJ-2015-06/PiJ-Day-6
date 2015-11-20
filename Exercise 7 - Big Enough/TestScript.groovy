CompanyRegister myCompany = new CompanyRegister();
boolean finished = false;
while(!finished) {
	print "Please enter name of new employee: ";
	String name = System.console().readLine();
	print "Please enter ID of new employee: ";
	String s = System.console().readLine();
	int id = Integer.parseInt(s);
	myCompany.addEmployee(name, id);
	print "Have you finished entering new employee information (y / n): ";
	s = System.console().readLine();
	if(s == "y") {
		finished = true;
	}
}
//prints all employee information
println "";
println "ALL EMPLOYEES:"
for(int i = 0; i < myCompany.getSize(); i++) {
	println myCompany.getEmployeeId()[i] + " - " + myCompany.getEmployeeName()[i];
}
//prints all employees whose ID is even
println "";
println "ALL EMPLOYEES WITH EVEN ID:"
for(int i = 0; i < myCompany.getSize(); i++) {
	if((myCompany.getEmployeeId()[i] % 2) == 0) {
		println myCompany.getEmployeeId()[i] + " - " + myCompany.getEmployeeName()[i];
	}
}
//prints all employees whose name begins with "S"
println "";
println "ALL EMPLOYEES WITH NAME BEGINNING WITH S:"
for(int i = 0; i < myCompany.getSize(); i++) {
	if(myCompany.getEmployeeName()[i].charAt(0) == 'S') {
		println myCompany.getEmployeeId()[i] + " - " + myCompany.getEmployeeName()[i];
	}
}