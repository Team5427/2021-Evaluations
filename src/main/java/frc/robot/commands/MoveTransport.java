package frc.robot.commands;


import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;

public class MoveTransport extends CommandBase{
    public MoveTransport(){
        addRequirements(RobotContainer.getTransport());
    }

    public void execute(){
        RobotContainer.getTransport().moveTransport(Constants.TRANSPORT_SPEED);
    }

    public boolean isFinished(boolean interrupted){
        return RobotContainer.getJoy().getRawButton(Constants.TRANSPORT_BUTTON);
    }

    public void end(){
        RobotContainer.getTransport().stop();
    }
}
