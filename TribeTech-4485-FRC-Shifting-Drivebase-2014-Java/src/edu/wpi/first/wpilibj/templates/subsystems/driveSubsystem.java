/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.commands.driveAndShift;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Joystick;

/**
 *
 * @author bradlye
 */
public class driveSubsystem extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    Talon frontLeft = new Talon(RobotMap.frontLeftMotor); Talon backLeft = new Talon(RobotMap.backLeftMotor);
    Talon frontRight = new Talon(RobotMap.frontRightMotor); Talon backRight = new Talon(RobotMap.backRightMotor);
    RobotDrive driveTrain = new RobotDrive(frontLeft, backLeft, frontRight, backRight);
    Solenoid leftShifter = new Solenoid(RobotMap.shiftLeftSolenoid);
    Solenoid rightShifter = new Solenoid(RobotMap.shiftRightSolenoid);
    Solenoid leftDeShifter = new Solenoid(RobotMap.deshiftLeftSolenoid);
    Solenoid rightDeShifter = new Solenoid(RobotMap.deshiftRightSolenoid);
    
    
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new driveAndShift());
    }
    
    public void teleopArcadeDrive(Joystick stick){
        driveTrain.arcadeDrive(stick);
    }
    
    public void autoDrive(double speed, double curveRate){
        driveTrain.drive(speed, curveRate);
    }
    
    public void shiftGears(){
        leftShifter.set(true);
        rightShifter.set(true);
        rightDeShifter.set(false);
        leftDeShifter.set(false);
    }
    
    public void deshiftGears(){
        leftShifter.set(false);
        rightShifter.set(false);
        leftDeShifter.set(true);
        rightDeShifter.set(true);
    }
    
    
    
    
}
