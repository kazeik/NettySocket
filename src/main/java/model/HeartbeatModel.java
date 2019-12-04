package model;

public class HeartbeatModel {

    /**
     * RefId : 29887ea8-7917-4af5-a676-a5c2fef089fe
     * Time : 2019-12-04 14:24:59
     * NextTime : 2019-12-04 14:25:19
     * DeviceCode : 210235C3FW319B000182
     * DeviceType : 5
     */

    private String RefId;
    private String Time;
    private String NextTime;
    private String DeviceCode;
    private int DeviceType;

    public String getRefId() {
        return RefId;
    }

    public void setRefId(String RefId) {
        this.RefId = RefId;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }

    public String getNextTime() {
        return NextTime;
    }

    public void setNextTime(String NextTime) {
        this.NextTime = NextTime;
    }

    public String getDeviceCode() {
        return DeviceCode;
    }

    public void setDeviceCode(String DeviceCode) {
        this.DeviceCode = DeviceCode;
    }

    public int getDeviceType() {
        return DeviceType;
    }

    public void setDeviceType(int DeviceType) {
        this.DeviceType = DeviceType;
    }
}
