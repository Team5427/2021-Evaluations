package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrain extends SubsystemBase{
    public static SpeedControllerGroup left, right;
    public static DifferentialDrive drive;

    public DriveTrain(SpeedControllerGroup left, SpeedControllerGroup right, DifferentialDrive drive){
        this.left = left;
        this.right = right;
        this.drive = drive;
    }

    public static void driveWithJoystick(Joystick joy){
        drive.arcadeDrive(joy.getY(), joy.getZ());
    }

    public static void stop(){
        left.stopMotor();
        right.stopMotor();
    }
}
