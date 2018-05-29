package feltech.strixdroidshooter.shooters;
import android.content.Context;

import feltech.strixdroidshooter.constructs.StrixException;


public abstract class AbstractShooter {

    /**
     * implies existance of some context or static preset,
     * will return positive if any relevant shooting agent is detected
     * @return
     */
    public abstract boolean chkCamPresenceDefault ( ) throws StrixException;

    /**
     * implies existance of some context or static preset for:
     *  camera
     *  it's shooting preset
     *  storage preset
     * @return
     */
    public abstract String shootAndStoreWhatever();

    /**
     * configures shooter for it's action; determines whether:
     * hardcoded defaults / soft (config) defaults / active config preset / or explicitly provided preset should be used
     * @param mode enum member
     * @param preset send null for any mode other than "Explicit"
     */
    public abstract void activatePreset (int mode, Object preset);
}
