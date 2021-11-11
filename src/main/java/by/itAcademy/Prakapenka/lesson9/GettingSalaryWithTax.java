package main.java.by.itAcademy.Prakapenka.lesson9;

//интерфейс для объектов типа "получающий зарплату" с вычетом налога
interface GettingSalaryWithTax
{
    final double SALARYTAX = 0.13;

    abstract double getSalaryWithTax();
}

