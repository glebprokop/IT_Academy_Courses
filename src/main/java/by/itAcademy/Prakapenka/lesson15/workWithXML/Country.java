package main.java.by.itAcademy.Prakapenka.lesson15.workWithXML;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlRootElement
@XmlType(propOrder = {"name", "languages", "population"})

public class Country
{
    private String name;
    private long population;
    List<Language> languages;

    public String getName() {
        return name;
    }

    @XmlElement(name = "country_name")
    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public List<Language> getLanguages() {
        return languages;
    }

    @XmlElementWrapper(name = "country_langs")
    @XmlElement(name = "language")
    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", languages=" + languages +
                '}';
    }
}
