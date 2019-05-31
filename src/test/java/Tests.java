
import java.util.EmptyStackException;
import org.junit.Assert;
import org.junit.Test;
import pl.edu.ur.oopl5.companyAndEmployees.company.Company;
import pl.edu.ur.oopl5.companyAndEmployees.employee.Employee;
import pl.edu.ur.oopl5.number.Number;
import pl.edu.ur.oopl5.stack.Stack;

/**
 */
public class Tests {

    @Test(expected = EmptyStackException.class, timeout = 1000)
    public void testEx3IsEmpty() {
        Stack stack = new Stack(5);
        try{
            if (stack.isEmpty() == true) {
        stack.pop();
                Assert.fail("There should be EmptyStackException, at least any Exception...");
            }
        } catch (Exception e){
            Assert.assertThat(e, (Matcher<? super Exception>) e);
    }

    @Test(expected = StackOverflowError.class, timeout = 1000)
    public void testEx3IsFull() {
        Stack stack = new Stack(1);
        stack.push(0);
        stack.push(0);
    }

    @Test(timeout = 1000)
    public void testEx3StackPushAndPop() {
        Stack stack = new Stack(5);
        stack.push(12);
        stack.push(10);

        Assert.assertEquals(10, stack.pop());
        Assert.assertEquals(12, stack.pop());

    }

 /* @Test(timeout = 1000)
    public void testEx5EmployeeAndCompany() {
        Employee employee = new Employee("Adam", "Nowak", 24, "Junior SocialMedia Specialist");
        Employee employee1 = new Employee("Jan", "Kowalski", 45, "Manager");
        Company company = new Company(7);

        company.addEmployee(employee);
        company.addEmployee(employee1);

        Employee[] employees = company.getEmployees();

        System.out.println(employees[0].getName());
        Assert.assertEquals("Adam", employees[0].getName());
        Assert.assertEquals("Nowak", employees[0].getSurname());
        Assert.assertEquals(24, employees[0].getAge());
        Assert.assertEquals("Junior SocialMedia Specialist", employees[0].getPosition());
    
        Assert.assertEquals("Jan", employees[1].getName());
        Assert.assertEquals("Kowalski", employees[1].getSurname());
        Assert.assertEquals(45, employees[1].getAge());
        Assert.assertEquals("Manager", employees[1].getPosition());

    }

    @Test(timeout = 1000)
    public void testEx6NumberConstr() {
        Number n = new Number("4");
        Assert.assertEquals(8, n.multiply(2));
        Assert.assertEquals(24, n.factorial());

        n.setNumber("3");
        Assert.assertEquals(6, n.multiply(2));
        Assert.assertEquals(6, n.factorial());
    }*/
}
