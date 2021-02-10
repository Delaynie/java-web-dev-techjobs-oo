package org.launchcode.techjobs_oo;

import javax.swing.text.Position;
import java.util.Objects;

public class PositionType {
    private int id;
    private static int nextId = 1;
    private String value;

    public PositionType() {
        id = nextId;
        nextId++;
    }

    public PositionType(String value) {
        this();
        this.value = value;
    }

    // TODO: Add a custom toString() method that returns the data stored in 'value'.

    @Override
    public String toString() {
        return value;
    }

    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.

    @Override
    public boolean equals(Object toBeCompared) {

     if (toBeCompared == this) {
        return true;
    }

   if (toBeCompared == null) {
        return false;
    }

   if (toBeCompared.getClass() != getClass()) {
        return false;
    }
        PositionType positionId = (PositionType) toBeCompared;
        return positionId.getId() == getId();
}

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getId());
    }


    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
