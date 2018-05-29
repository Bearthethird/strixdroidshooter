package feltech.strixdroidshooter.constructs.domain;
import android.util.ArrayMap;

import java.util.Calendar;
import java.util.Date;

/**
 *  this contains models device camera configuration
 */
public class StrixDeviceModel {

    public String modelName;
    public int modelIndex;
    public ArrayMap<CameraRole,CameraModel> deviceSetup; // full data on device hardware configuration

    /**
     * provides hard defaults for context
     * @return
     */
    public static StrixDeviceModel getHD(){
        StrixDeviceModel deviceModel = new StrixDeviceModel();
        deviceModel.modelName = "Strix_HD_boomstick";
        deviceModel.modelIndex = 0;
        deviceModel.deviceSetup = new ArrayMap<CameraRole,CameraModel>();
        deviceModel.deviceSetup.put(new CameraRole(),CameraModel.getHDASI1600());
        return deviceModel;

    }

}
