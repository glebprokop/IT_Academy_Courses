package main.java.by.itAcademy.Prakapenka.lesson9;

//зарплата начальника почти везде почасовая
class Chief extends Worker
{
    final String SALARYTYPE = "Salary for work time";

    double baseTariff;
    int workTime;

    Chief(String firstName, String secondName, String subdivision, String workPosition, double baseTariff, int workTime){
        super(firstName, secondName, subdivision, workPosition);
        this.baseTariff = baseTariff;
        this.workTime = workTime;
    }

    public double getBaseTariff() {
        return baseTariff;
    }

    public void setBaseTariff(double baseTariff) {
        this.baseTariff = baseTariff;
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }

    @Override
    double getSalary(){
        return baseTariff * workTime;
    }
}
