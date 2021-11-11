/**
 * Эта программа описывает процедуру начисления заработной платы
 *
 * Начисление повременной заработной платы происходит по формуле: базовая тарифная ставка * часы работы
 *
 * Начисление сдельной заработной платы происходит по формуле: количество изготовленной продукции *
 *          стоимость 1 единицы продукции
 *
 * Начисление по смешанной схеме происходит следующим образом:
 *          начисление ЗП происходит по формуле для повременной ЗП, однако предусмотрена премия для
 *          поощрения при перевыполнении определенного показателя (рассчитывается по формуле для сдельной ЗП)
 *
 * Расчет предусмотрен для 3-х видов должностей: начальник (повременная),  эксперт (сдельная), старший эксперт (смешанная)
 */

package main.java.by.itAcademy.Prakapenka.lesson9;

public class Application {
    public static void main(String[] args) {
        Worker[] workers = new Worker[4];
        workers[0] = new Chief("Oleg", "Karelin", "Vitebsk Department", "Main chief",
                100.0, 160);

        workers[1] = new SimpleForensic("Hleb", "Prakapenka", "Vitebsk Department", "Forensic",
                25.0, 10);

        workers[2] = new SimpleForensic("Ivan", "Pupkin", "Vitebsk Department", "Forensic",
                25.0, 6);

        workers[3] = new HightForensic("Timofei", "Zaitsev", "Vitebsk Department", "Hight forensic",
                100.0, 160, 25.0, 3);

        for (Worker everyWorker : workers){
            System.out.println("In this month the worker - " + everyWorker.workPosition + " - " + everyWorker.firstName + " " +
                    everyWorker.secondName + " get salary in " + everyWorker.getSalary());
            System.out.println("The salary of " + everyWorker.firstName + " " + everyWorker.secondName + " net of tax is " +
                    + everyWorker.getSalaryWithTax());
            System.out.println();
        }
    }
}
