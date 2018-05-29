package feltech.strixdroidshooter.constructs.domain;

/**
 * Serves to determine BPP (bytes-per-pixel) rate and identify interpretation strategy
 */
public enum ImagingMode {
    GreyScale8,
    GreyScale16,
    RGB8,
    RGB16;

    public int getInt() {
        switch (this) {
            case RGB8: return 1;
            case RGB16: return -1;
            case GreyScale8: return 0;
            case GreyScale16: return 2;
        }
        return -1;
    }

    public byte getBPP() {
        switch (this) {
            case RGB8: return 3;
            case RGB16: return 6;
            case GreyScale8: return 1;
            case GreyScale16: return 2;
        }
        return 0;
    }
}


