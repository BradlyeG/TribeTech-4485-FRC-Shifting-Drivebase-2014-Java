package edu.wpi.first.wpilibj.templates;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static final int leftMotor = 1;
    // public static final int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static final int rangefinderPort = 1;
    // public static final int rangefinderModule = 1;
    
    //PWMs
    public static final int frontLeftMotor = 1;
    public static final int backLeftMotor = 2;
    public static final int frontRightMotor = 3;
    public static final int backRightMotor = 4;
    
    //Solenoids
    public static final int shiftLeftSolenoid = 1;
    public static final int shiftRightSolenoid = 2;
    
    //Relays
    public static final int compressorRelay = 1;
    
    //Digital IOs
    public static final int compressorSaftey = 1;
    
    //OI Stick ports
    public static final int drivingStickPort = 1;
    
    //Buttons
    public static final int buttonA = 1;
    
}
