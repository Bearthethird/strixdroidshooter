package feltech.strixdroidshooter.devices;
import android.util.ArrayMap;

import feltech.strixdroidshooter.constructs.domain.devicesetup.CameraRole;

/**
 *  this contains  model-associated device setup data
 */
public class DeviceModel  {

    public String modelName;
    public int modelIndex;
    public ArrayMap<CameraRole,CameraModel> deviceModelSetup; // contains full data on device model hardware

    /**
     * provides hard defaults for context
     * @return
     */
    public static DeviceModel getHD(){
        DeviceModel deviceModel = new DeviceModel();
        deviceModel.modelName = "Strix_HD_boomstick";
        deviceModel.modelIndex = 0;
        deviceModel.deviceModelSetup = new ArrayMap<CameraRole,CameraModel>();
        deviceModel.deviceModelSetup.put(CameraRole.getHD(),CameraModel.getHDASI1600());
        return deviceModel;

    }
}
