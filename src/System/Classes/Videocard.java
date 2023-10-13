package System.Classes;

public enum Videocard {
    GEFORCERTX3060( 550, 13499, 17167) {
    },
    GEFORCERTX4060 (550, 13999, 20139),
    RADEONRX6700(750, 11999, 16628),
    RADEONRX7900(700, 26499, 30450),
    GEFORCERTX4080(850, 53499, 34969);
    private final int price;
    private final int neededPower;
    private final int perfomance;
    private Videocard(int neededPower, int price, int perfomance) {
        this.neededPower = neededPower;
        this.price = price;
        this.perfomance = perfomance;
    }
    public int getPrice() {
        return price;
    }
}
