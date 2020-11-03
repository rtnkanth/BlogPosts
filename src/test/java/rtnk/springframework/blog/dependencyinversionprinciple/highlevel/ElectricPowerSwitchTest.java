package rtnk.springframework.blog.dependencyinversionprinciple.highlevel;

import rtnk.springframework.blog.dependencyinversionprinciple.lowlevel.Fan;
import rtnk.springframework.blog.dependencyinversionprinciple.lowlevel.LightBulb;
import org.junit.Test;

public class ElectricPowerSwitchTest {

    @Test
    public void testPress() throws Exception {
     Switchable switchableBulb=new LightBulb();
     Switch bulbPowerSwitch=new ElectricPowerSwitch(switchableBulb);
     bulbPowerSwitch.press();
     bulbPowerSwitch.press();

    Switchable switchableFan=new Fan();
    Switch fanPowerSwitch=new ElectricPowerSwitch(switchableFan);
    fanPowerSwitch.press();
    fanPowerSwitch.press();
    }
}