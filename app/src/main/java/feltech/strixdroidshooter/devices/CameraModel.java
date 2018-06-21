package feltech.strixdroidshooter.devices;

import android.util.ArrayMap;

import java.util.ArrayList;

import feltech.strixdroidshooter.constructs.domain.devicesetup.ImagingMode;

/**
 * data structure containing attributes relevant to camera model, such as:
 * compatible resolutions
 * supported imaging modes and supported USB modes
 */
public class CameraModel {

    public String modelName = "";
    public String producerName = "";
    public ArrayMap<Integer, ArrayList<Integer>> resolutions = new ArrayMap<Integer, ArrayList<Integer>>() ;
    public ArrayList<ImagingMode> imagingModes = new ArrayList<ImagingMode>();


    public static CameraModel getHDASI1600() {
        CameraModel cm = new CameraModel();
        return cm;

    }

}
