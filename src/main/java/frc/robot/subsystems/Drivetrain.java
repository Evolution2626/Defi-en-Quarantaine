/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.interfaces.Gyro;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Drivetrain extends SubsystemBase {
  /**
   * Creates a new ExampleSubsystem.
   */
  private Gyro gyro = new ADXRS450_Gyro();
  
  private TalonSRX avantGauche;
  private TalonSRX milieuGauche;
  private TalonSRX arriereGauche;
  private TalonSRX avantDroit;
  private TalonSRX milieuDroit;
  private TalonSRX arriereDroit;
  private TalonSRX milieuMilieu;


  public Drivetrain(){
    avantGauche = new TalonSRX(Constants.CAN.MOTEUR_AVANT_GAUCHE);
    milieuGauche = new TalonSRX(Constants.CAN.MOTEUR_MILIEU_GAUCHE);
    arriereGauche = new TalonSRX(Constants.CAN.MOTEUR_ARRIERE_GAUCHE);
    avantDroit = new TalonSRX(Constants.CAN.MOTEUR_AVANT_DROIT);
    milieuDroit = new TalonSRX(Constants.CAN.MOTEUR_MILIEU_DROIT);
    arriereDroit = new TalonSRX(Constants.CAN.MOTEUR_ARRIERE_DROIT);
    milieuMilieu = new TalonSRX(Constants.CAN.MOTEUR_MILIEU_MILIEU);

    avantGauche.setInverted(false);
    milieuGauche.setInverted(false);
    arriereGauche.setInverted(false);
    avantDroit.setInverted(false);
    milieuDroit.setInverted(false);
    arriereDroit.setInverted(false);
    milieuMilieu.setInverted(false);

  }


  public void resetGyro(){
      gyro.reset();
  }

  public double getGyroAngle(){
    return gyro.getAngle();
  }

  public Gyro getGyro(){
    return gyro;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
