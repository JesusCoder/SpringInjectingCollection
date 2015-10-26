package com.tutorialspoint.demoInjectingCollection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** This MainApp is also working fine. */
public class MainAppForDemoInjectingCollection {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext(
                "com/tutorialspoint/demoInjectingCollection/beansForDemoInjectingCollection.xml");

        JavaCollection jc = (JavaCollection) context.getBean("javaCollection");

        jc.getAddressList();
        jc.getAddressSet();
        jc.getAddressMap();
        jc.getAddressProp();

        System.out.println("That's the end of the program!");
    }
}
