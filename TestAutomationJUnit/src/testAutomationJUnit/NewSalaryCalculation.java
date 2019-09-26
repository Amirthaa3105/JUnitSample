package testAutomationJUnit;
import testAutomationJUnit.EmpDetails;
public class NewSalaryCalculation {
	public double calculateNewSalary(EmpDetails emp)
	{
		return emp.getEmp_salary()+50000;
	}

}
