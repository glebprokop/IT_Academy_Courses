/**
 * Решил попробовать синхронизацию двумя методами, через синхонизацию объекта класса
 * и через синхронизацию метода, выполняющего действия.
 * Эта реализация - через синхронизацию объекта класса
 *
 * Работает, если создавать только один текущий объект, и уже его передавать во
 * все создаваемые потоки, надеюсь, что реализация более корректна )))
 */

package main.java.by.itAcademy.Prakapenka.lesson17.SynhroObject;

public class SynhroExercise implements Runnable
{
    @Override
    public void run() {
        synchronized (this){
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
