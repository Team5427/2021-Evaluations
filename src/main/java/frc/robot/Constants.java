// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final int LEFT_TOP_MOTOR = 14; 
	public static final int LEFT_BOTTOM_MOTOR = 15;
	public static final int RIGHT_TOP_MOTOR = 0;
    public static final int RIGHT_BOTTOM_MOTOR = 1;
    public static final int INTAKE_MOTOR = 10; 
    public static final int TRANSPORT_MOTOR = 12;
    public static final int PULLEY_MOTOR = 11;
    public static final int SHOOTER_MOTOR_TOP = 9;
    public static final int SHOOTER_MOTOR_BOTTOM = 6;

    public static final double INTAKE_SPEED = 0.7;
    public static final double TRANSPORT_SPEED = -0.7;
    public static final double PULLEY_SPEED = 1.0;
    public static final double SHOOTER_SPEED = 1.0;

    public static final int INTAKE_BUTTON = 6;
    public static final int TRANSPORT_BUTTON = 7;
    public static final int PULLEY_BUTTON = 6;
    public static final int SHOOTER_BUTTON = 7;
}
