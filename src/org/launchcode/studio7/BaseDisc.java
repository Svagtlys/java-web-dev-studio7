package org.launchcode.studio7;

import java.util.Objects;

public abstract class BaseDisc {
    protected boolean isSpinning;
    protected final String name, type;
    protected final double maxStorageBytes;
    protected final int requiredNanometers;
    protected double usedStorage;
    protected String contents = "";
    protected int numScratches;

    public BaseDisc(String name, String type, double maxStorageBytes, int requiredNanometers){
        this.name = name;
        this.type = type;
        this.maxStorageBytes = maxStorageBytes;
        this.requiredNanometers = requiredNanometers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseDisc baseDisc = (BaseDisc) o;
        return Objects.equals(name, baseDisc.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getNumScratches(){
        return "This disc has " + this.numScratches + " scratches.";
    }

}
