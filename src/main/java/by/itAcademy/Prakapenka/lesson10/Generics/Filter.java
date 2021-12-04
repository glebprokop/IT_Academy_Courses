package main.java.by.itAcademy.Prakapenka.lesson10.Generics;

public interface Filter
{
    <T> boolean apply(T o);
}
