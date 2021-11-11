package main.java.by.itAcademy.Prakapenka.lesson9;

//зарплата старшего эксперта - смешанная, т.е. он может получить премию за перевыполнение показателя
class HightForensic extends Chief
{
    final String SALARYTYPE = "Salary for mix scheme";

    double baseCostOneExamination;
    int numberExaminationMorePlan;

    HightForensic(String firstName, String secondName, String subdivision, String workPosition, double baseTariff, int workTime,
                  double baseCostOneExamination, int numberExaminationMorePlan){
        super(firstName, secondName, subdivision, workPosition, baseTariff, workTime);
        this.baseCostOneExamination = baseCostOneExamination;
        this.numberExaminationMorePlan = numberExaminationMorePlan;
    }

    public double getBaseCostOneExamination() {
        return baseCostOneExamination;
    }

    public void setBaseCostOneExamination(double baseCostOneExamination) {
        this.baseCostOneExamination = baseCostOneExamination;
    }

    public int getNumberExaminationMorePlan() {
        return numberExaminationMorePlan;
    }

    public void setNumberExaminationMorePlan(int numberExaminationMorePlan) {
        this.numberExaminationMorePlan = numberExaminationMorePlan;
    }

    @Override
    double getSalary(){
        return (baseTariff * workTime) + (numberExaminationMorePlan * baseCostOneExamination);
    }
}
