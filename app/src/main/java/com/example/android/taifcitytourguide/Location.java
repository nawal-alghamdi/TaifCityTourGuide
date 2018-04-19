package com.example.android.taifcitytourguide;

/**
 * {@link Location} represents a locations that the user wants to visit.
 * It contains a name, address and an image resource id for that location.
 */

public class Location {

    // The name of the location
    private String locationName;

    // The address of the location
    private String locationAddress;

    // The image resource id for the location
    private int locationImageSrcId;

    /**
     * Create a new Location object.
     *
     * @param locationName       is the location name
     * @param locationAddress    is the location address
     * @param locationImageSrcId is the image resource id for the location
     */
    public Location(String locationName, String locationAddress, int locationImageSrcId) {
        this.locationName = locationName;
        this.locationAddress = locationAddress;
        this.locationImageSrcId = locationImageSrcId;
    }


    /**
     * Get the location name.
     */
    public String getLocationName() {
        return locationName;
    }

    /**
     * Get the location address.
     */
    public String getLocationAddress() {
        return locationAddress;
    }

    /**
     * Get the image resource id for the location.
     */
    public int getLocationImageSrcId() {
        return locationImageSrcId;
    }


}
