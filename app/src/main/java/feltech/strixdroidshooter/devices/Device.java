package feltech.strixdroidshooter.devices;

import android.util.ArrayMap;

import feltech.strixdroidshooter.constructs.StrixException;
import feltech.strixdroidshooter.constructs.DataSRC;
import feltech.strixdroidshooter.constructs.domain.devicesetup.CameraRole;


/**
 * this is description of imaging device instance that might contain multiple sensors of arbitrary models, roles and configs
 * SHOOTERS operate with whole devices while NODE_TSHOOTERS operate individual sensors
 */
public class Device {

    // credentias
    public String serialNumber;
    /**
     * contains full data on device hardware units with CameraRole acting as exact "address" of imaging unit within device
     */
    public ArrayMap<CameraRole,Camera> deviceData;
    public DataSRC src;


    public Device(){

        this.deviceData = new  ArrayMap<CameraRole,Camera>();
    }

    /**
     * checks if device imaging units are accessible
     * @return
     */
    public boolean checkIfOperational() throws StrixException {

        return false;
    }

    /**
     * checks if device imaging units are operational, i'e not busy and ready to receive instructions
     * @return
     */
    public boolean checkIfReady() throws StrixException {

        return false;
    }



}
