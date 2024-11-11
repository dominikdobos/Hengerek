package hu.szamalk.modell;

public class LyukasHenger extends TomorHenger {
    private double falvastagsag;

    public LyukasHenger(double sugar, double magassag, double fajsuly, double falvastagsag) {
        super(sugar, magassag, fajsuly);
        this.falvastagsag = falvastagsag;
    }

    public LyukasHenger(double sugar, double magassag, double falvastagsag) {
        this(sugar, magassag, 1, falvastagsag);
    }

    public double getFalvastagsag() {
        return falvastagsag;
    }

    @Override
    public double terfogat() {
        double eredeti = super.terfogat();

        setSugar(getSugar()-falvastagsag);
        double seged = super.terfogat();

        setSugar(getSugar()+falvastagsag);

        return eredeti - seged;
    }

    @Override
    public String toString() {
        String os = super.toString();
        return os + " <--- LyukasHenger{" +
                "falvastagsag=" + falvastagsag +
                '}';
    }
}
