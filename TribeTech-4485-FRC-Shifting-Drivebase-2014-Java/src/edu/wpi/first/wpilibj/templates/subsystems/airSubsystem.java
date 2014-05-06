/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 * @author bradlye
 */
public class airSubsystem extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    DigitalInput compressorSafety = new DigitalInput(RobotMap.compressorSaftey);
    Relay air = new Relay(RobotMap.compressorRelay);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void activateAir(){
        if(compressorSafety.get())
        {
            air.set(Relay.Value.kOn);
        }
        else
        {
            air.set(Relay.Value.kOff);
        }
    }
}
