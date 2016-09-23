package org.usfirst.ftc.exampleteam.yourcodehere;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

import org.swerverobotics.library.SynchronousOpMode;

/**
 controls the robot
 */
@TeleOp(name="My First OpMode")
public class RobotPhoneControl extends LinearOpMode
    {
    //Deciare motors
        DcMotor motorLeft = null;
        DcMotor motorRight = null;

    // Declare servos

    Servo servoArm = null;


    @Override public void main() throws InterruptedException
        {
            //Initialize motors
            motorLeft = hardwareMap.dcMotor.get("motorLeft");
            motorRight = hardwareMap.dcMotor.get("motorRight");

            //initiala

             // Set motor channel modes
            motorLeft.setChannelMode(DcMotorController.RunMode.RUN_WITHOUT_ENCODERS);
            motorRight.setChannelMode(DcMotorController.RunMode.RUN_WITHOUT_ENCODERS);

            //Initialize servos
            servoArm = hardwareMap.

            // Reverse left drive motors so we don't spin when applying full power
            motorLeft.setDirection(DcMotor.Direction.REVERSE);
            // Wait for the game to start
        waitForStart();

        // Go go gadget robot!
        while (opModeIsActive())
            {
            if (updateGamepads())
                {
                // The game pad state has changed. Do something with that!
                    //Tank drive
                    motorLeft.setPower(gamepad1.left_stick_stick_y);
                    motorLeft.setPower(gamepad1.left_stick_stick_y);
                }

            telemetry.update();
            idle();
            }
        }
    }
