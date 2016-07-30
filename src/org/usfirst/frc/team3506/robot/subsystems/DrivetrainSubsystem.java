package org.usfirst.frc.team3506.robot.subsystems;

import org.usfirst.frc.team3506.robot.commands.UserDriveCommand;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DrivetrainSubsystem extends Subsystem {
    
    Talon talon1, talon2, talon3, talon4;
    
    public DrivetrainSubsystem() {
		talon1 = new Talon(1);
		talon2 = new Talon(2);
		talon3 = new Talon(3);
		talon4 = new Talon(4);
		
		talon1.setInverted(true);
		talon2.setInverted(true);
	}

    public void initDefaultCommand() {
        setDefaultCommand(new UserDriveCommand());
    }
    
    public void drive(double left, double right) {
    	talon1.set(left);
    	talon2.set(left);
    	talon3.set(right);
    	talon4.set(right);
    }
}

