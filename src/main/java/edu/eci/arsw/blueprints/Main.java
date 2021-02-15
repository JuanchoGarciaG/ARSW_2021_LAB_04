package edu.eci.arsw.blueprints;


import edu.eci.arsw.blueprints.model.Blueprint;
import edu.eci.arsw.blueprints.services.BlueprintsServices;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Set;

public class Main {

    public static void main(String... args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        BlueprintsServices cs = ac.getBean(BlueprintsServices.class);
        Set<Blueprint> allBlueprints = cs.getAllBlueprints();
        cs.getBlueprint("IJuanchoG","blueprin1");

        System.out.println("TERMINAMOS");
        int a = 0;
    }
}
