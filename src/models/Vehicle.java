package models;

public class Vehicle {
    private String vehicleMake;
    private String vehicleModel;
    private String vehicleYear;

    public Vehicle() {
    }

    public Vehicle(String vehicleMake, String vehicleModel, String vehicleYear) {
        this.vehicleMake = vehicleMake;
        this.vehicleModel = vehicleModel;
        this.vehicleYear = vehicleYear;
    }

    public String getVehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getVehicleYear() {
        return vehicleYear;
    }

    public void setVehicleYear(String vehicleYear) {
        this.vehicleYear = vehicleYear;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Vehicle{");
        sb.append("vehicleMake='").append(vehicleMake).append('\'');
        sb.append(", vehicleModel='").append(vehicleModel).append('\'');
        sb.append(", vehicleYear='").append(vehicleYear).append('\'');
        sb.append('}');
        return sb.toString();
    }
}