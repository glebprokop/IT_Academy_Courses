package main.java.by.itAcademy.Prakapenka.lesson15.workWithXML;

import javax.xml.bind.*;
import java.io.File;
import java.util.Arrays;
import java.util.List;

public class Application
{
    public static void main(String[] args) {
        Country country = new Country();
        country.setName("Russia");
        country.setPopulation(160_000_000);

        Language language1 = new Language("Russian");
        Language language2 = new Language("Ukrainian");
        List<Language> rusLanguages = Arrays.asList(language1, language2);
        country.setLanguages(rusLanguages);

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Country.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            File file = new File("test.xml");

            marshaller.marshal(country, file);

            //unmarshalling block
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Country takedCountry = (Country) unmarshaller.unmarshal(file);
            System.out.println(takedCountry.toString());
        } catch (PropertyException e) {
            e.printStackTrace();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
