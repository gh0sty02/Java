package com.pranay;

public class Table {
    private Dimensions dimensions;
    private boolean hasRGB;

    public Table(Dimensions dimensions, boolean hasRGB) {
        this.dimensions = dimensions;
        this.hasRGB = hasRGB;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public boolean isHasRGB() {
        return hasRGB;
    }
}
