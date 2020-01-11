package DataType;

import java.util.ArrayList;

public class ListDateType {
    public static void main(String[] args) {
//        ArrayList pitches = new ArrayList();
        ArrayList<String> pitches = new ArrayList<String>();
        pitches.add("138");
        pitches.add(0, "129");

        System.out.println(pitches.get(1));
    }
}
