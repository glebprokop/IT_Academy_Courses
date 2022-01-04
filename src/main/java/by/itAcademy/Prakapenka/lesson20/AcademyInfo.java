package main.java.by.itAcademy.Prakapenka.lesson20;

import java.lang.annotation.*;

/**
 * Создание аннотации AcademyInfo. Цель - для пометки методов, время жизни - всегда (в том числе в Runtime).
 */
@Target(value=ElementType.METHOD)
@Retention(value= RetentionPolicy.RUNTIME)
public @interface AcademyInfo {
    String year();
}
