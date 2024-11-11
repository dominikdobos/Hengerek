package hu.szamalk;

import hu.szamalk.modell.LyukasHenger;
import hu.szamalk.modell.MertaniHenger;
import hu.szamalk.modell.TomorHenger;

import java.util.ArrayList;
import java.util.List;

public class HengerProgram {
    private List<MertaniHenger> hengerek;

    public static void main(String[] args) {
    new HengerProgram().run();
    }

    public void run() {
        int db = MertaniHenger.getHengerDarab();
        System.out.printf("A feladatban használt hengerek (%d db): \n", db);
//        for (MertaniHenger henger : hengerek) {
//            System.out.println(henger);
//        }

        for (MertaniHenger henger : this.lista()) {
            System.out.println(henger);
        }

        System.out.println("Hengerek átlagtérfogata: " + this.atlagTerfogat());

        System.out.println("Csövek súlya:" + this.csovekSulya());
    }

    public HengerProgram() {
        this.hengerek = new ArrayList<>();
        hengerek.add(new MertaniHenger(1, 1));
        hengerek.add(new TomorHenger(1,1));
        hengerek.add(new LyukasHenger(1,1,0.1));
        hengerek.add(new LyukasHenger(1,1,0.5));
        hengerek.add(new LyukasHenger(1,1,0.9));
    }

    public double atlagTerfogat() {
        return 0.0;
    }

    public double csovekSulya() {
        return 0.0;
    }

    private List<MertaniHenger> lista() {
        return hengerek;
    }
}