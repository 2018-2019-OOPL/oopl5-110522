package pl.edu.ur.oopl5.companyAndEmployees.company.abstractClasses;

public abstract class AbstractPerson {

    protected String name;
    protected String surname;
    protected int age;

    public AbstractPerson(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public abstract String getName();

    public abstract void setName(String name);

    public abstract String getSurname();

    public abstract void setSurname(String surname);

    public abstract int getAge();

    public abstract void setAge(int age);

}