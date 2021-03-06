package feltech.strixdroidshooter.conrollers;

import android.util.Log;

import feltech.strixdroidshooter.constructs.StrixException;
import feltech.strixdroidshooter.constructs.domain.devicesetup.CameraRole;
import feltech.strixdroidshooter.devices.ASICAM.ASIcamPreset;
import feltech.strixdroidshooter.devices.CameraPreset;

/**
 * top level abstract functionality for managing device state
 */
public  class StrixStateController {
    private String logTag = "StateController";

    /**
     *
     * @return
     * @throws StrixException
     */
    public CameraPreset getDevice() throws StrixException {
        Log.d(logTag, "getDevice");

        return new ASIcamPreset();

    }

    public void preserveCameraState (CameraRole cam, CameraPreset preset) throws StrixException {
        Log.d(logTag, "preserveCameraState");

    }

    public CameraPreset getCameraState (CameraRole cam) throws StrixException {
        Log.d(logTag, "getCameraState");

        return new ASIcamPreset();

    }
}
