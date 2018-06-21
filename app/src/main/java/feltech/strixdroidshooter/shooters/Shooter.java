package feltech.strixdroidshooter.shooters;

import android.util.Log;

import feltech.strixdroidshooter.constructs.StrixException;
import feltech.strixdroidshooter.devices.Camera;
import feltech.strixdroidshooter.devices.CameraPreset;
import feltech.strixdroidshooter.devices.Device;
import feltech.strixdroidshooter.devices.DeviceFactory;

/**
 * this class contains top level methods for practical operations with StriX device
 * only this class is expected to be directly called from UI's ActionPanel when invoking primary hardware functionality
 * unlike node shooters this class is not supposed to be inherited
 */
public class Shooter {

    String logTag = "Shooter";

    /**
     * single simultanious shot with all guns as they are configured and store results in default storage
     * @return
     */
    public void broadside(Device device) throws StrixException {
        Log.d(logTag, "broadside");
        device = new DeviceFactory().getDevice();
        if (device.checkIfOperational()) {
            if (device.checkIfReady()) {



            }
        }
    }

    /**
     * Async single simultanious shot with all guns as they are configured and store results in default storage
     * @return
     */
    public void broadsideAsync()throws StrixException {
        Log.d(logTag, "broadsideAsync");


    }
}
