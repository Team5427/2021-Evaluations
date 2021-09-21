package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.subsystems.DriveTrain;

public class DriveWithJoystick extends CommandBase{

    public DriveWithJoystick(){
        addRequirements(RobotContainer.getDriveTrain());
    }

    public void execute(){
        RobotContainer.getDriveTrain().driveWithJoystick(RobotContainer.getJoy());
    }

    public boolean isFinished(boolean interrupted){
        return false;
    }

    public void end(){
        RobotContainer.getDriveTrain().stop();
    }
    
}
