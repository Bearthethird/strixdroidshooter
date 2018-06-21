package feltech.strixdroidshooter.actions;

import android.util.Log;

import feltech.strixdroidshooter.devices.ASICAM.ASIcamera;
import feltech.strixdroidshooter.devices.CameraPreset;
import feltech.strixdroidshooter.devices.Camera;
import feltech.strixdroidshooter.shooters.NodeShooter;
import feltech.strixdroidshooter.devices.CameraFactory;
import feltech.strixdroidshooter.shooters.ShooterFactroty;

/**
 *  this will provide top level camera interaction features to forms
 */
public class CameraActionPanel {
    private String logTag = "ActionPanel";
    String errState = "";



    /**
     * get fresh image from StriX camera and store it in image library
     * @return imgAddress
     */
    public String shootImgToLib( ) {
        Log.d(logTag, "shootImgToLib");
        String imgAddress = new String();
        NodeShooter shooter =  (new ShooterFactroty()).getDefalultShooter();

        // 2 connect => setup => shoot => store sequence with all defaults
        try {
            if (shooter.chkCamPresence(new ASIcamera())) {

                /// 2.1 connect (get ID)
                Camera cam = (new CameraFactory()).getHdCamera();

                /// 2.2 setup
                CameraPreset preset = cam.getHDpreset();

                return "got a camera here!";




                //shooter.activatePreset(0, null);

                /// 2.3 shoot
            } else errState = "no camera found";

                 /// 2.4 store
        } catch (Exception SE) {

            /// 2.5 log errors
            Log.d(logTag, "Exception: shootImgToLib");
            errState = String.format("Something went wrong: {1}", SE.getMessage().substring(0, 100));
            return "";
        }

        return imgAddress;
    }




}
