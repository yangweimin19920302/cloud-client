package app.bean;

import java.util.Date;

/**
 * Created by Administrator on 2016/5/4.
 */
public class Device {
    private String deviceID;
    private String deviceName;
    private String shopID;
    private String shopName;
    private String MAC;
    private double memSize;
    private String remark;
    private String softwareVersion;
    private String hardwareVersion;
    private Date addDate;

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getShopID() {
        return shopID;
    }

    public void setShopID(String shopID) {
        this.shopID = shopID;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public double getMemSize() {
        return memSize;
    }

    public void setMemSize(double memSize) {
        this.memSize = memSize;
    }

    public String getHardwareVersion() {
        return hardwareVersion;
    }

    public void setHardwareVersion(String hardwareVersion) {
        this.hardwareVersion = hardwareVersion;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public String getMAC() {
        return MAC;
    }

    public void setMAC(String MAC) {
        this.MAC = MAC;
    }
}
