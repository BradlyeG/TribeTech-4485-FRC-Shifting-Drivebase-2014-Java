/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

/**
 *
 * @author bradlye
 */
public class driveAndShift extends CommandBase {
    
    boolean shifted = false;
    
    public driveAndShift() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(driveTrain);
        requires(air);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        air.activateAir();
        driveTrain.teleopArcadeDrive(oi.driveStick());
        
        if(oi.getDrivingA()){
            if(shifted){
                    shifted = false;
                    driveTrain.deshiftGears();
            }
            else if(!shifted)
            {
                    shifted = true;
                    driveTrain.shiftGears();
            }
        }
     }
      

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
