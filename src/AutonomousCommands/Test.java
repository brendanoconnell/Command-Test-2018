package AutonomousCommands;

import org.usfirst.frc.team1989.robot.Robot;
import org.usfirst.frc.team1989.robot.RobotMap;
import org.usfirst.frc.team1989.robot.commands.AutoDrive;
import org.usfirst.frc.team1989.robot.commands.AutoRotate;
import org.usfirst.frc.team1989.robot.commands.AutoTimedDrive;
import org.usfirst.frc.team1989.robot.commands.AutoTower;
import org.usfirst.frc.team1989.robot.commands.BoxOutput;
import org.usfirst.frc.team1989.robot.commands.Delay;

import edu.wpi.first.wpilibj.command.CommandGroup;


public class Test extends CommandGroup {
	
	//place holder value to be determined for timed drive
	double x = 0;

    public Test() {
    		requires(Robot.driveTrain); 
    		requires(Robot.tower);
    		requires(Robot.boxArm);
    		
    		addParallel(new AutoTower(.5, 1));
		addSequential(new AutoDrive(20, 1, 0, RobotMap.r1));
		addSequential(new Delay());
		addSequential(new AutoTimedDrive(3, 0.5, 0));
		addSequential(new Delay());
		addSequential(new AutoRotate(90));
		addSequential(new Delay());
		addSequential(new BoxOutput(-1), 4);
    }
}
