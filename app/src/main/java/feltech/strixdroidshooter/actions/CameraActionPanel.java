package feltech.strixdroidshooter.actions;

import android.util.Log;
import feltech.strixdroidshooter.constructs.StrixException;
import feltech.strixdroidshooter.constructs.domain.AbstractCameraPreset;
import feltech.strixdroidshooter.shooters.AbstractCamera;
import  feltech.strixdroidshooter.shooters.AbstractShooter;
import feltech.strixdroidshooter.shooters.CameraFactory;
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
        AbstractShooter shooter =  (new ShooterFactroty()).getDefalultShooter();

        // 2 connect => setup => shoot => store sequence with all defaults
        try {
            if (shooter.chkCamPresenceDefault()) {

                /// 2.1 connect (get ID)
                AbstractCamera cam = (new CameraFactory()).getHdCamera();

                /// 2.2 setup
                AbstractCameraPreset preset = cam.getHardDefaultPreset();

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
