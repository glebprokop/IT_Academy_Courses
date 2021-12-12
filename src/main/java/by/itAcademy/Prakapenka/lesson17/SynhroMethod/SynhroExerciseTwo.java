/**
 * Решил попробовать синхронизацию двумя методами, через синхонизацию объекта класса
 * и через синхронизацию метода, выполняющего действия.
 * Эта реализация - через синхронизацию выполняющего метода (work)
 */

package main.java.by.itAcademy.Prakapenka.lesson17.SynhroMethod;

public class SynhroExerciseTwo extends Thread
{

    @Override
    public void run() {
        this.work();
    }

    public synchronized void work(){
        try {
            System.out.println(this.getName());
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
