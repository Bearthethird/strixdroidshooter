package feltech.strixdroidshooter.constructs.domain.devicesetup;

/**
 * precisely describes imaging unit in device setup
 */
public final class CameraRole  {

    public CameraPosition _position = CameraPosition.strixDefault;
    public CameraOrientation _orientation = CameraOrientation.strixDefault;
    public CameraFunction _function = CameraFunction.strixDefault;
    public int _index = 0; // sequential number of multiple units with identical usage patterns

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        return this.hashCode() == ((CameraRole)obj).hashCode();
    }

    @Override
    public int hashCode() {
        return this._position.hashCode() +
                this._orientation.hashCode()*10 +
                this._function.hashCode()*100 +
                this._index*1000;
    }

    public static CameraRole getHD() {

        return new CameraRole();

    }

}
