package peaksoft;

public class Djailoo {

    private String nameFerm;
    private String address;
    private String name;
    private Ui[] cow;
    private Koy[] ship;
    private At[] horse;


    public Djailoo(String nameFerm, String address, String name, Ui[] cow, Koy[] ship, At[] horse) {
        this.nameFerm = nameFerm;
        this.address = address;
        this.name = name;
        this.cow = cow;
        this.ship = ship;
        this.horse = horse;
    }

    public String getNameFerm() {
        return nameFerm;
    }

    public void setNameFerm(String nameFerm) {
        this.nameFerm = nameFerm;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ui[] getCow() {

        return cow;
    }

    public void setCow(Ui[] cow) {
        this.cow = cow;

    }

    public Koy[] getShip() {


        return ship;
    }

    public void setShip(Koy[] ship) {
        this.ship = ship;
    }

    public At[] getHorse() {

        return horse;
    }

    public void setHorse(At[] horse) {
        this.horse = horse;
    }
}
