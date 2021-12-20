package main.java.by.itAcademy.Prakapenka.lesson17.SynhroMethod;

public class BuisnessLogicClass {
    public synchronized void work() {
        try {
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
