package pl.edu.ur.oopl5.companyAndEmployees.employee;

import pl.edu.ur.oopl5.companyAndEmployees.company.abstractClasses.AbstractPerson;

public class Employee extends AbstractPerson implements EmployeeInterface {

    private String position;

    public Employee(String name, String surname, int age) {
        super(name, surname, age);
        this.position = position;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

}
