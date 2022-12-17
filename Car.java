package Java;

public class Car {
    private Integer id;
    private String license;
    private Account driver;
    private Integer passengenger;

    public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;
    }

    void printDataCar() {
        System.out.println("License: " + license + "Name Driver:" + driver.name + " Passenger: " + passengenger);
    }

    public Integer getPassenger() {
        return passengenger;
    }

    public void setPassenger(Integer passenger) {
        if (passenger == 4) {
            this.passengenger = passenger;
        } else {
            System.out.println("Necesitas asignar 4 pasajeros");
        }

    }

    public Integer getPassengenger() {
        return passengenger;
    }

    public void setPassengenger(Integer passengenger) {
        this.passengenger = passengenger;
    }

}
