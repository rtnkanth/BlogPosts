package rtnk.springframework.blog.dependencyinversionprinciple.lowlevel;

import rtnk.springframework.blog.dependencyinversionprinciple.highlevel.Switchable;

public class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("LightBulb: Bulb turned on...");
    }

    @Override
    public void turnOff() {
        System.out.println("LightBulb: Bulb turned off...");
    }
}
