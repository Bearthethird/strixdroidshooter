package feltech.strixdroidshooter.devices;

import android.util.Log;

import feltech.strixdroidshooter.constructs.DataSRC;
import feltech.strixdroidshooter.constructs.StrixException;
import feltech.strixdroidshooter.constructs.domain.devicesetup.CameraRole;

public class DeviceFactory {

        String logTag = "DeviceFactory";

        /**
         * retrieves hard default  default device setup
         * @return
         */
        public Device getHDdevice () {
            Device device = new Device();
            device.serialNumber= "0000000";
            device.src = DataSRC.HardDefaults;
            device.deviceData.put (CameraRole.getHD(), CameraFactory.getHdCamera());
            return device;
        }

        /**
         * attempts to retrieve device setup from  config
         * @return
         * @throws StrixException
         */
        public Device getConfigDevice ( ) throws StrixException {
            Log.d(logTag, "getConfigDevice");
            //TODO: config action
            return this.getHDdevice();
        }

        /**
         * Waterfall genesis sequence: looks for device setup data in following order:
         * 1. config
         * 2. hard defaults
         */
        public Device getDevice ( ) throws StrixException {
            Log.d(logTag, "getDevice");
            //TODO: config action
            return this.getHDdevice();        }

    }
