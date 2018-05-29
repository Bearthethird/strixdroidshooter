package feltech.strixdroidshooter.shooters;

import feltech.strixdroidshooter.constructs.StrixException;
import feltech.strixdroidshooter.constructs.domain.AbstractCameraPreset;
import feltech.strixdroidshooter.constructs.domain.CameraModel;

public abstract class AbstractCamera {

    //<credentials>
    private AbstractCameraPreset hardDefaultPreset;
    private String sessionId;
    private String uid;
    private String name;
    private CameraModel modelData;

    public Object nativeCam; // in case we'll need an instance to work with APIs

    public AbstractCameraPreset getHardDefaultPreset() {
        return  this.hardDefaultPreset;
    }
    public void setHardDefaultPreset(AbstractCameraPreset preset) {
        this.hardDefaultPreset = preset;
    }

    public void setSessionId (String sessionId) {
          this.sessionId = sessionId;
    }
    public String getSessionId ( ) {
        return this.sessionId;
    }

    public void setUid (String uid) {
        this.uid = uid;
    }
    public String getUid ( ) {
        return this.uid;
    }

    public void setName (String name) {
        this.name = name;
    }
    public String getName( ) {
        return this.name;
    }

    public void setModel (CameraModel cm) {
        this.modelData = cm;
    }
    public CameraModel getModel( ) {
        return this.modelData;
    }

    public Object getNativeCam () {
        return this.nativeCam;
    }

    public void setNativeCam (Object ncam) {
        this.nativeCam = ncam;
    }

    /**
     * to begin camera interactions it's usually enough to provide it's temporary id that we fished with our shooter
     * @throws StrixException
     */
    public abstract void init(String sessionid) throws StrixException;

    /**
     * apply specific preset to this imaging device
     * @param preset
     * @throws StrixException
     */
    public abstract void applyPreset(AbstractCameraPreset preset) throws StrixException;


    /**
     * apply current this.<credentials> to this imaging device
     * @throws StrixException
     */
    public abstract void applyCredentials() throws StrixException;

    /**
     * retrieve current preset from this imaging device and store into this.<credentials>
     * @throws StrixException
     */
    public abstract void readCredentials() throws StrixException;


    /**
     * retrieve current preset from this imaging device
     * @return
     * @throws StrixException
     */
    public abstract AbstractCameraPreset readPreset() throws StrixException;

}
