package feltech.strixdroidshooter.devices.ASICAM;

import android.util.Log;
import com.zwo.ZwoCamera;
import java.util.ArrayList;

import feltech.strixdroidshooter.devices.CameraModel;
import feltech.strixdroidshooter.constructs.domain.devicesetup.ImagingMode;
import feltech.strixdroidshooter.constructs.StrixException;
import feltech.strixdroidshooter.devices.Camera;
import feltech.strixdroidshooter.devices.CameraPreset;

public class ASIcamera extends Camera {
    private String logTag = "ASIcamera";

    /**
     * constructor with Hard Default preset
     */

    public ASIcamera(){
        ASIcamPreset hdPreset = new ASIcamPreset();
        hdPreset.setBrightness(1);
        hdPreset.setExosure(1000000);
        hdPreset.setImagingMode(ImagingMode.GreyScale16);
        byte b = 1;
        hdPreset.setBinning(b);
        hdPreset.setGamma(50);
        this.setHardDefaultPreset(hdPreset);
    }

    /**
     * constructor with Hard Default preset
     */
    public  CameraPreset getHDpreset(){
        ASIcamPreset hdPreset = new ASIcamPreset();
        hdPreset.setBrightness(1);
        hdPreset.setExosure(1000000);
        hdPreset.setImagingMode(ImagingMode.GreyScale16);
        byte b = 1;
        hdPreset.setBinning(b);
        hdPreset.setGamma(50);
        return hdPreset;
    }

    /**
     * provides Hard Default camera model data
     */
    public CameraModel getHDmodel(){
        CameraModel cm = new CameraModel();
        cm.modelName = "ASI1600";
        cm.producerName = "ZWO";
        ArrayList<Integer> res1 = new ArrayList<>();
        res1.add(4656);
        res1.add(3520);
        ArrayList<Integer> res2  = new ArrayList<>();
        res2.add(2328);
        res2.add(1760);
        cm.resolutions.put(1, res2);
        ArrayList<Integer> res3  = new ArrayList<>();
        res3.add(1552);
        res3.add(1172);
        cm.resolutions.put(1, res3);
        ArrayList<Integer> res4  = new ArrayList<>();
        res4.add(1160);
        res4.add(880);
        cm.resolutions.put(1, res4);
        cm.imagingModes.add(ImagingMode.GreyScale8);
        cm.imagingModes.add(ImagingMode.GreyScale16);
        cm.imagingModes.add(ImagingMode.GreyScale8);
        return cm;
    }

    /**
     * reliably returns session ID of ZWO imaging device
     * @return 0 if anything goes wrong; sid otherwise
     */
    public int getSID() {
        String ssid = super.getSessionId();
        if (!(ssid == null)) {
            if (!ssid.isEmpty()) {
                try {
                    return Integer.parseInt(ssid);
                } catch (Exception e) {
                    return 0;
                }
            } else return 0;
        } else return 0;
    }

    @Override
    public void applyPreset(CameraPreset preset) throws StrixException {
        Log.d(logTag, "applyPreset");
        ASIcamPreset asiPreset = (ASIcamPreset) preset;
        ZwoCamera ncam = new ZwoCamera(getSID());
        if (ncam.setRoiFormat(1, 1, asiPreset.getBinning(), asiPreset.getImagingMode().getInt()).intVal > 0) {
            Log.e(logTag, "setRoiFormat");
            throw new StrixException("setRoiFormat");
        }
    }

    @Override
    public ASIcamPreset readPreset() throws StrixException {
        Log.d (logTag, "readPreset");
        return new ASIcamPreset();
    }

    @Override
    public void applyCredentials() throws StrixException {

    }

    @Override
    public void readCredentials() throws StrixException {

    }

    @Override
    public CameraPreset getConfiguredPreset() throws StrixException {
        Log.d (logTag, "getConfiguredPreset");
        return new ASIcamPreset();
    }

    @Override
    public CameraPreset getSDpreset() throws StrixException {
        Log.d (logTag, "getSDpreset");
        return new ASIcamPreset();
    }


    public void init(String sessionID) throws StrixException {
        Log.d (logTag, "init");
        try {
            ZwoCamera ncam = new ZwoCamera(getSID());
            this.setNativeCam(ncam);
            if (ncam.openCamera().intVal > 0) {
                Log.e (logTag, "openCamera");
                throw  new StrixException("openCamera");
            }
            if (ncam.initCamera().intVal > 0) {

                Log.e (logTag, "initCamera");
                throw  new StrixException("initCamera");
            }
        } catch (Exception e) {
            Log.e (logTag, "init");
            throw  new StrixException(e.getMessage());
        }

    }
}
