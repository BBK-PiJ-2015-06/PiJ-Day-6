public class CompanyRegister {
	
	private String[] employeeName;
	private int[] employeeId;
	
	public CompanyRegister() {
		employeeName = new String[0];
		employeeId = new int[0];
	}
	
	public void addEmployee(String name, int id) {
		String[] tempName = new String[this.employeeName.length + 1];
		int[] tempId = new int[this.employeeId.length + 1];
		for(int i = 0; i < employeeName.length; i++) {
			tempName[i] = employeeName[i];
		}
		tempName[tempName.length - 1] = name;
		for(int j = 0; j < employeeId.length; j++) {
			tempId[j] = employeeId[j];
		}
		tempId[tempId.length - 1] = id;
		employeeName = tempName;
		employeeId = tempId;
	}
	
	public int getSize() {
		return employeeName.length;
	}
	
	public String[] getEmployeeName() {
		return employeeName;
	}
	
	public int[] getEmployeeId() {
		return employeeId;
	}
}