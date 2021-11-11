package main.java.by.itAcademy.Prakapenka.lesson9;

abstract class Worker implements GettingSalaryWithTax
{
    final String organisationName = "State Forensic Examination Commettee";

    String firstName;
    String secondName;
    String subdivision;
    String workPosition;

    Worker(String firstName, String secondName, String subdivision, String workPosition){
        this.firstName = firstName;
        this.secondName = secondName;
        this.subdivision = subdivision;
        this.workPosition = workPosition;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSubdivision() {
        return subdivision;
    }

    public void setSubdivision(String subdivision) {
        this.subdivision = subdivision;
    }

    public String getWorkPosition() {
        return workPosition;
    }

    public void setWorkPosition(String workPosition) {
        this.workPosition = workPosition;
    }

    abstract double getSalary();

    @Override
    public double getSalaryWithTax(){
        double salary = getSalary();
        return (salary - salary * SALARYTAX);
    }
}
