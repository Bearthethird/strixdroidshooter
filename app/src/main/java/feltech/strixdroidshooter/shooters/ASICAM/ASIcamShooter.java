package feltech.strixdroidshooter.shooters.ASICAM;

import feltech.strixdroidshooter.App;
import feltech.strixdroidshooter.shooters.AbstractShooter;
import feltech.strixdroidshooter.constructs.StrixException;
import com.zwo.ASIUSBManager;
import com.zwo.ZwoCamera;
import android.util.Log;

/**
 * from here we will make ASICAM api calls, round up exceptions etc
 *
 */
public class ASIcamShooter extends AbstractShooter {
    private String logTag = "ASIShooter";

    public ASIcamShooter(){
        ASIUSBManager.initContext(App.getContext());
    }

    @Override
    public boolean chkCamPresenceDefault () throws StrixException {
        Log.d(logTag, "chkCamPresenceDefault");
        try {
            return ZwoCamera.getNumOfConnectedCameras() > 0 ? true : false;

        } catch (Exception e) {
            throw new StrixException(e.getMessage());
        }
    }
    @Override
    public String shootAndStoreWhatever() {
        Log.d(logTag, "shootAndStoreWhatever");

        return null;
    }

    @Override
    public void activatePreset(int mode, Object preset) {
        Log.d(logTag, "activatePreset");
    }
}
