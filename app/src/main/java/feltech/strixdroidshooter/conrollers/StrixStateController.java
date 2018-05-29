package feltech.strixdroidshooter.conrollers;

import android.util.Log;

import feltech.strixdroidshooter.constructs.StrixException;
import feltech.strixdroidshooter.constructs.domain.CameraRole;
import feltech.strixdroidshooter.constructs.domain.ASICAM.ASIcamPreset;
import feltech.strixdroidshooter.constructs.domain.AbstractCameraPreset;

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
    public AbstractCameraPreset getDevice() throws StrixException {
        Log.d(logTag, "getDevice");

        return new ASIcamPreset();

    }

    public void preserveCameraState (CameraRole cam, AbstractCameraPreset preset) throws StrixException {
        Log.d(logTag, "preserveCameraState");

    }

    public AbstractCameraPreset getCameraState (CameraRole cam) throws StrixException {
        Log.d(logTag, "getCameraState");

        return new ASIcamPreset();

    }
}
