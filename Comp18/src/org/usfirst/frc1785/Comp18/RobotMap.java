// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc1785.Comp18;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PWMTalonSRX;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController rightd;
    public static SpeedController leftd;
    public static DifferentialDrive drive;
    public static TalonSRX ClawR;
    public static TalonSRX ClawL;
    //public static SpeedControllerGroup ClawZ;
    public static  WPI_TalonSRX wrist;
    public static DoubleSolenoid AirArm;
    public static Solenoid AirShifter;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    //public static int wrist =4;
    public static int frontCam = 0;
    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        rightd = new PWMTalonSRX(0);
        LiveWindow.addActuator("DriveTainS", "rightd", (PWMTalonSRX) rightd);
        rightd.setInverted(true);
        
        leftd = new PWMTalonSRX(1);
        LiveWindow.addActuator("DriveTainS", "leftd", (PWMTalonSRX) leftd);
        leftd.setInverted(true);
        
        drive = new DifferentialDrive(leftd,rightd);
        LiveWindow.addActuator("DriveTainS", "drive", drive);
        drive.setSafetyEnabled(true);
        drive.setExpiration(0.1);
        drive.setMaxOutput(1.0);

        ClawR = new WPI_TalonSRX(6);
        //LiveWindow.addActuator("Claw", "ClawR", ClawR);
        ClawR.set(ControlMode.PercentOutput, 0);
        ClawR.setNeutralMode(NeutralMode.Brake);
        
        ClawL = new WPI_TalonSRX(3);
        //LiveWindow.addActuator("Claw", "ClawL", ClawL);
        ClawL.follow(ClawR);
        
        
        //ClawZ = new SpeedControllerGroup(ClawR, ClawL  );
        //LiveWindow.addActuator("Claw", "ClawZ", ClawZ);
        
        wrist = new WPI_TalonSRX(4);
       
        //LiveWindow.addActuator("Wrist", "wrist", wrist);
        
        AirArm = new DoubleSolenoid(2, 3);
        LiveWindow.addActuator("Arm", "AirArm", AirArm);
        
        AirShifter = new Solenoid(0, 0);
        LiveWindow.addActuator("GearShifter", "AirShifter", AirShifter);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
