package feltech.strixdroidshooter.shooters;

import feltech.strixdroidshooter.shooters.ASICAM.ASIcamera;

/**
 * will fetch camera instances for various providers
 */
public class CameraFactory {

    public AbstractCamera getHdCamera() {

        return new ASIcamera();
    }

}
