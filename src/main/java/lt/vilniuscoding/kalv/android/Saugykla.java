package lt.vilniuscoding.kalv.android;

import java.util.ArrayList;
import java.util.List;

/**
 * VCS
 */
public class Saugykla {

    private static List<String> irasai;

    public Saugykla() {
        List<String> irasai = new ArrayList<String>();
        irasai.add("pirmas");
        irasai.add("antras");
        irasai.add("trecias");
        irasai.add("ketvirtas");
        irasai.add("+");
        setIrasai(irasai);
    }

    public static List<String> getIrasai() {
        return irasai;
    }

    public static void setIrasai(List<String> items) {
        irasai = items;
    }

    public static void addIrasai(int i,String irasas) {
        irasai.add(i, irasas);
    }


    public static void addIrasaiIVieta(int i, String s) {
        irasai.set(i, s);
    }
}
