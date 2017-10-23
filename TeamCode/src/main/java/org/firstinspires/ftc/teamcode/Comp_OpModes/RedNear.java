package org.firstinspires.ftc.teamcode.Comp_OpModes;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.robotcore.external.navigation.RelicRecoveryVuMark;

/**
 * Created by abhin on 10/23/2017.
 */
@Autonomous(name = "RedNear",group = "Auton")
public class RedNear extends LinearOpMode {
    RelicRecoveryVuMark seenMark;
    ElapsedTime runtime = new ElapsedTime();
    double timeOutS = 5.0;
    @Override
    public void runOpMode() throws InterruptedException {
        //TODO HardwareBot Initialization
        //TODO Start the Vuforia Object
        //TODO Calibrate the IMU
        //TODO Calibrate the Light Sensor
        telemetry.addData("Status: ","Initilization Complete");
        telemetry.update();

        waitForStart();
        //TODO Vuforia Trackables Activate
        //Loop For a certain amount of time until the Image is Seen
        runtime.reset();
        while (seenMark != RelicRecoveryVuMark.UNKNOWN || runtime.seconds() < timeOutS) { // will break somewhere... hopefully on seeing a recognizable trackable
            RelicRecoveryVuMark vuMark = RelicRecoveryVuMark.from(relicTemplate);
            if (vuMark != RelicRecoveryVuMark.UNKNOWN) {
                seenMark = vuMark;
                break;
            }
            idle();
        }

        //TODO Drive until the light sensor sees a large change in light
        

        //TODO If the seenMark is null then set to a default

        //TODO Encoder Drive Forward based on the seen Mark

        //TODO Turn 90 based on IMU

        //TODO Drive Forward a constant Distance Encoder Drive

        //TODO Release the Glyph

    }


}