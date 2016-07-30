package org.usfirst.frc.team3506.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class TestCommandGroup extends CommandGroup {
    
    public  TestCommandGroup() {
        addSequential(new UniversalDriveCommand(-0.4, -0.4, 2));
        addSequential(new UniversalDriveCommand(-0.5, 0.5, 3));
    }
}
