/**
 * Решил попробовать синхронизацию двумя методами, через синхонизацию объекта класса
 * и через синхронизацию метода, выполняющего действия.
 * Эта реализация - через синхронизацию выполняющего метода (work)
 */

package main.java.by.itAcademy.Prakapenka.lesson17.SynhroMethod;

public class SynhroExerciseTwo extends Thread
{
    BuisnessLogicClass buisnessLogic;

    public SynhroExerciseTwo(BuisnessLogicClass buisnessLogic){
        this.buisnessLogic = buisnessLogic;
    }

    @Override
    public void run() {
        buisnessLogic.work();
    }

//    public synchronized void work(){
//        try {
//            System.out.println(this.getName());
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
}
