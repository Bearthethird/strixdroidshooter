package feltech.strixdroidshooter.devices;

import feltech.strixdroidshooter.constructs.StrixException;
import feltech.strixdroidshooter.devices.ASICAM.ASIcamera;

/**
 * will fetch camera instances for various providers
 */
public class CameraFactory {

    /**
     * returns hard default camera instance
     * @return
     */
    public static Camera getHdCamera() {

        return new ASIcamera();
    }

    /**
     * retrieves camera instance by id from config
     * @return
     */
    public Camera getConfigCamera(String camID) throws StrixException {

        return new ASIcamera();
    }


}
