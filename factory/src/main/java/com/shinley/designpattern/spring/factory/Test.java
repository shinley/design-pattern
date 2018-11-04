package com.shinley.designpattern.spring.factory;

import java.io.IOException;
import java.util.Properties;

public class Test {
    public static void main(String[] args) {
        Properties props = new Properties();
        try {
            props.load(Test.class.getClassLoader().getResourceAsStream("com/shinley/designpatern/spring/factory/spring.properties"));

            String vehicleTypeName = props.getProperty("VehicleType");
            Object o = Class.forName(vehicleTypeName).newInstance();
            Moveable m = (Moveable)o;
            m.run();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
