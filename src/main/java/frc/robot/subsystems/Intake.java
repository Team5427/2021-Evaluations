package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase{

    public SpeedController intake;

    public Intake(SpeedController intake){
        this.intake = intake;
    }

    public void moveIntake(double speed){
        intake.set(speed);
    }

    public void stop(){
        intake.stopMotor();
    }
}
