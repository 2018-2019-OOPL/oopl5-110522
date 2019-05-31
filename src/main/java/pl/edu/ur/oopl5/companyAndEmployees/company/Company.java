package pl.edu.ur.oopl5.companyAndEmployees.company;


import pl.edu.ur.oopl5.companyAndEmployees.company.abstractClasses.AbstractCompany;
import pl.edu.ur.oopl5.companyAndEmployees.employee.Employee;

public class Company extends AbstractCompany {

    public int e;
    
    public Company(int n) {
        super(n);
    }

    @Override
    public void addEmployee(Employee e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Employee[] getEmployees() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void printEmployees() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
