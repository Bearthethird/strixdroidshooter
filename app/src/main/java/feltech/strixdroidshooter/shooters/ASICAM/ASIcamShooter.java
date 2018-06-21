package feltech.strixdroidshooter.shooters.ASICAM;

import feltech.strixdroidshooter.App;
import feltech.strixdroidshooter.devices.CameraPreset;
import feltech.strixdroidshooter.shooters.NodeShooter;
import feltech.strixdroidshooter.devices.Camera;
import feltech.strixdroidshooter.constructs.StrixException;
import com.zwo.ASIUSBManager;
import com.zwo.ZwoCamera;
import android.util.Log;

/**
 * from here we will make ASICAM api calls, round up exceptions etc
 *
 */
public class ASIcamShooter extends NodeShooter {
    private String logTag = "ASIShooter";

    public ASIcamShooter(){
        ASIUSBManager.initContext(App.getContext());
    }

    @Override
    public boolean chkCamPresence(Camera Unit) throws StrixException {
        Log.d(logTag, "chkCamPresenceDefault");
        try {
            //TODO: turn into proper check by camera UUID
            return ZwoCamera.getNumOfConnectedCameras() > 0 ? true : false;

        } catch (Exception e) {
            throw new StrixException(e.getMessage());
        }
    }

    @Override
    public String shootAndStoreWhatever(Camera Unit) {
        Log.d(logTag, "shootAndStoreWhatever");

        return null;
    }

    @Override
    public void activatePreset(int mode, CameraPreset preset) {
        Log.d(logTag, "activatePreset");
    }
}
