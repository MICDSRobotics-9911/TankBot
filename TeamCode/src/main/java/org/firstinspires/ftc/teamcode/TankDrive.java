package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

import org.firstinspires.ftc.teamcode.robotplus.hardware.Motor;
import org.firstinspires.ftc.teamcode.robotplus.hardware.MotorPair;
import org.firstinspires.ftc.teamcode.robotplus.hardware.Robot;

@TeleOp(name = "TankBot")
public class TankDrive extends OpMode {
    private Robot robot;
    private MotorPair tankDrive;


    @Override
    public void init() {
        this.tankDrive = new MotorPair(hardwareMap, "motor1", "motor2");
        this.tankDrive.getMotor1().setDirection(DcMotorSimple.Direction.FORWARD);
        this.tankDrive.getMotor2().setDirection(DcMotorSimple.Direction.FORWARD);

        this.tankDrive.getMotor1().setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        this.tankDrive.getMotor2().setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }

    @Override
    public void loop() {
        this.tankDrive.getMotor1().setPower(gamepad1.left_stick_y);
        this.tankDrive.getMotor1().setPower(gamepad1.right_stick_y);
    }
}
