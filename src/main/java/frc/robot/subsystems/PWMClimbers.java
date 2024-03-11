// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import static frc.robot.Constants.ClimberConstants.*;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class PWMClimbers extends SubsystemBase {
  /*Class member variables. These variables represent things the class needs to keep track of and use between
  different method calls. */
  DifferentialDrive m_Climbers;
  Spark RightClimber = new Spark(RClimberID);
  Spark LeftClimber = new Spark(LClimberID);
  

  /*Constructor. This method is called when an instance of the class is created. This should generally be used to set up
   * member variables and perform any configuration or set up necessary on hardware.
   */
  public PWMClimbers() {
    m_Climbers = new DifferentialDrive(LeftClimber, RightClimber);  
  }

  //Method to control the climbers using tank drive.
  public void m_Climbers(double left, double right) {
    m_Climbers.tankDrive(left, right);
  }
}