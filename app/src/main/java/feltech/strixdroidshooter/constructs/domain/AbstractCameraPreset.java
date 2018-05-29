package feltech.strixdroidshooter.constructs.domain;

import feltech.strixdroidshooter.constructs.domain.ImagingMode;

public abstract class AbstractCameraPreset {

    private long exposure; // in MICRO-seconds
    private float gamma;
    private float brightness;
    private byte binning;
    private ImagingMode imagingMode;

    public long getExosure() {
        return this.exposure;
    }
    public void setExosure(long Exposure) {
        this.exposure = Exposure;
    }

    public float getGamma() {
        return this.gamma;
    }
    public void setGamma(float Gamma) {
        this.gamma = Gamma;
    }

    public float getBrightness() {
        return this.brightness;
    }
    public void setBrightness(float brightness) {
        this.brightness = brightness;
    }

    public byte getBinning() {
        return this.binning;
    }
    public void setBinning(Byte binning) {
        this.binning = binning;
    }

    public ImagingMode getImagingMode() {
        return this.imagingMode;
    }
    public void setImagingMode(ImagingMode imagingMode) {
        this.imagingMode = imagingMode;
    }

}
