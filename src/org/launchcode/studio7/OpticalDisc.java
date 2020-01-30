package org.launchcode.studio7;

public interface OpticalDisc {
    void spinDisc(); //Data can only be written and read while disc is spinning
    void stopDisc();
    boolean writeData(String data, int nanometersOfLaser, double storageRequirement);//    Data gets written to the discs by using a laser
    String readData(int nanometersOfLaser);//    The data on the discs can be read by using a laser
    String readName(int nanometersOfLaser);//    Once loaded, they both report information like name, capacity, contents, and disc type
    double readCapacity(int nanometersOfLaser);
    String readDiscType(int nanometersOfLaser);
    void scratchDisc();//    They are easily scratched


}
