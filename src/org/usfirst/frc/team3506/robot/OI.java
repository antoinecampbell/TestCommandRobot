package org.usfirst.frc.team3506.robot;

import org.usfirst.frc.team3506.robot.commands.TestCommandGroup;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    
	public Joystick leftJoystick;
	public Joystick rightJoystick;
	
	public OI() {
		leftJoystick = new Joystick(1);
		rightJoystick = new Joystick(2);
		
		JoystickButton l2 = new JoystickButton(leftJoystick, 2);
		l2.whenPressed(new TestCommandGroup());
	}
}

