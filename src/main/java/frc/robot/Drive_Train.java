// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
/** Add your docs here. */
public class Drive_Train {
    DifferentialDrive tank; //normal drive wheels tank drive
    Victor fStrafe, bStrafe; // solenoids that control strafing wheel height
    Ultrasonic ultraLeft, ultraRight;
    PowerDistributionPanel PDBoard;
    Encoder frontCode, backCode, leftCode, rightCode;

}
