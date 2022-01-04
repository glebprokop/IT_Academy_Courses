package main.java.by.itAcademy.Prakapenka.lesson19;

/**
 * Перечисление для возможных событий.
 * Добавился параметр приоритета, который оценивают обработчики событий.
 */
public enum Events {
    FATAL(4), ERROR(3), DEBUG(2), INFO(1);

    private int priority;
    Events(int priority){
        this.priority = priority;
    }

    public int getPriority(){
        return priority;
    }
}
