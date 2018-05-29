package feltech.strixdroidshooter.shooters;
import feltech.strixdroidshooter.shooters.ASICAM.ASIcamShooter;


/**
 *  fetches shooter instances for various camera providers and APIs
 */
public class ShooterFactroty {

    /**
     * something to start with
     * @return
     */
    public AbstractShooter getDefalultShooter() {

        return new ASIcamShooter();
        }
}
