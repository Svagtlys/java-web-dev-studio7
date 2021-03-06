package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc{
    private final static double MAX_CAPACITY = 4.7 * 1000000000; //in bytes
    private final static int REQ_NM_LASER = 650;

    public DVD(String name){
        super(name, "DVD", MAX_CAPACITY, REQ_NM_LASER);
    }

    @Override
    public void spinDisc() {
        this.isSpinning = true;
    }

    @Override
    public void stopDisc() {
        this.isSpinning = false;
    }

    @Override
    public boolean writeData(String data, int nanometersOfLaser, double storageRequirement) {
        if(isSpinning && nanometersOfLaser == this.requiredNanometers && this.usedStorage + storageRequirement <= this.maxStorageBytes){
            this.contents += data;
            return true;
        }
        return false;
    }

    @Override
    public String readData(int nanometersOfLaser) {
        if(isSpinning && nanometersOfLaser == this.requiredNanometers){
            return this.contents;
        }
        return "";
    }

    @Override
    public String readName(int nanometersOfLaser) {
        if(isSpinning && nanometersOfLaser == this.requiredNanometers){
            return this.name;
        }
        return "";
    }

    @Override
    public double readCapacity(int nanometersOfLaser) {
        if(isSpinning && nanometersOfLaser == this.requiredNanometers){
            return this.maxStorageBytes;
        }
        return 0;
    }

    @Override
    public String readDiscType(int nanometersOfLaser) {
        if(isSpinning && nanometersOfLaser == this.requiredNanometers){
            return this.type;
        }
        return "";
    }

    @Override
    public void scratchDisc() {
        this.numScratches += 1;
    }


}
