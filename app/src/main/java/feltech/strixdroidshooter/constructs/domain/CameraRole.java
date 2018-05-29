package feltech.strixdroidshooter.constructs.domain;

import feltech.strixdroidshooter.constructs.domain.setup.StrixFunction;
import feltech.strixdroidshooter.constructs.domain.setup.StrixOrientation;
import feltech.strixdroidshooter.constructs.domain.setup.StrixPosition;

/**
 * describes camera role in device configuration
 */
public final class CameraRole {

    public StrixPosition _position = StrixPosition.strixDefault;
    public StrixOrientation _orientation = StrixOrientation.strixDefault;
    public StrixFunction _function = StrixFunction.strixDefault;
    public int _sequence = 0;

}
