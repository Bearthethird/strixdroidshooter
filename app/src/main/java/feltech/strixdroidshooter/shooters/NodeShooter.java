package feltech.strixdroidshooter.shooters;


import feltech.strixdroidshooter.constructs.domain.devicesetup.CameraRole;
import feltech.strixdroidshooter.devices.Camera;
import feltech.strixdroidshooter.constructs.StrixException;
import feltech.strixdroidshooter.devices.CameraPreset;
import feltech.strixdroidshooter.devices.Device;

/**
 *  contains methods for
 */
public abstract class NodeShooter {

    /**
     * implies existence of some context or static preset,
     * will return positive if imaging unit of particular location is detected
     * @return
     */
    public abstract boolean chkCamPresence (Camera unit) throws StrixException;

    /**
     * implies existance of some context or static preset for:
     *  camera
     *  it's shooting preset
     *  storage preset
     * @return
     */
    public abstract String shootAndStoreWhatever(Camera unit);

    /**
     * configures shooter for it's action; determines whether:
     * hardcoded defaults / soft (config) defaults / active config preset / or explicitly provided preset should be used
     * @param mode enum member
     * @param preset send null for any mode other than "Explicit"
     */
    public abstract void activatePreset (int mode, CameraPreset preset);
}
