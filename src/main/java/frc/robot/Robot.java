package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
// import edu.wpi.first.wpilibj.Timer;
// import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;

public class Robot extends TimedRobot {
  private Spark leftMotori = new Spark(0);
  private Spark leftMotor2 = new Spark(1);
  private Spark leftMotor3 = new Spark(3);
  private Spark rightMotor = new Spark(4);
  private Spark rightMotor2 = new Spark(5);
  private Spark rightMotor3 = new Spark(6);

  private Joystick joy1 = new Joystick(0);

  @Override
  public void robotInit() {}

  @Override
  public void autonomousInit() {}

  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {}

  @Override
  public void teleopPeriodic() {
    double speed = joy1.getRawAxis(1);
    double turn = joy1.getRawAxis(4);

    double left = speed + turn;
    double right = speed - turn;

    leftMotor1.set(left); 
    leftMotor2.set(left);
    leftMotor3.set(left);
    rightMotor1.set(-right);
    rightMotor2.set(-right);
    rightMotor3.set(-right);
  }

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}
}
