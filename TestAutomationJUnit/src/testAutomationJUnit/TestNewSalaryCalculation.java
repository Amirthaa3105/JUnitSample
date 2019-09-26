package testAutomationJUnit;
import org.junit.Test;
import static org.junit.Assert.*;
import testAutomationJUnit.EmpDetails;
import testAutomationJUnit.NewSalaryCalculation;
public class TestNewSalaryCalculation {
	@Test
	public void test1()
	{
		NewSalaryCalculation nsc_obj=new NewSalaryCalculation();
		EmpDetails ed_obj=new EmpDetails();
		ed_obj.setEmp_salary(100000.65);
		assertEquals(150000.65,nsc_obj.calculateNewSalary(ed_obj),0.0);
	}
		
	


}
