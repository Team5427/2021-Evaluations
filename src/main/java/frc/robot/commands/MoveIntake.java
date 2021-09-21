package frc.robot.commands;


import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;

public class MoveIntake extends CommandBase{
    public MoveIntake(){
        addRequirements(RobotContainer.getIntake());
    }

    public void execute(){
        RobotContainer.getIntake().moveIntake(Constants.INTAKE_SPEED);
    }

    public boolean isFinished(boolean interrupted){
        return RobotContainer.getJoy().getRawButton(Constants.INTAKE_BUTTON);
    }

    public void end(){
        RobotContainer.getIntake().stop();
    }
}
