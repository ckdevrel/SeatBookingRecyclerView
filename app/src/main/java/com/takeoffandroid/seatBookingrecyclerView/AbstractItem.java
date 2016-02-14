package com.takeoffandroid.seatBookingrecyclerView;

public abstract class AbstractItem {

    public static final int TYPE_CENTER = 0;
    public static final int TYPE_EDGE = 1;
    public static final int TYPE_EMPTY = 2;

    private String label;


    public AbstractItem(String label) {
        this.label = label;
    }


    public String getLabel() {
        return label;
    }

    abstract public int getType();




}
