package main.java.by.itAcademy.Prakapenka.lesson9;

//зарплата простого эксперта зависит от количества выполненных экспертиз (сдельная)
class SimpleForensic extends Worker
{
    final String SALARYTYPE = "Salary for work made before";

    double baseCostOneExamination;
    int numberExaminaion;

    SimpleForensic(String firstName, String secondName, String subdivision, String workPosition, double baseCostOneExamination, int numberExaminaion){
        super(firstName, secondName, subdivision, workPosition);
        this.baseCostOneExamination = baseCostOneExamination;
        this.numberExaminaion = numberExaminaion;
    }

    public double getBaseCostOneExamination() {
        return baseCostOneExamination;
    }

    public void setBaseCostOneExamination(double baseCostOneExamination) {
        this.baseCostOneExamination = baseCostOneExamination;
    }

    public int getNumberExaminaion() {
        return numberExaminaion;
    }

    public void setNumberExaminaion(int numberExaminaion) {
        this.numberExaminaion = numberExaminaion;
    }

    @Override
    double getSalary(){
        return baseCostOneExamination * numberExaminaion;
    }
}
