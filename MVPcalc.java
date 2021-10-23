import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class MVPcalc {
    public static void main(String[] args) {
        HashSet<NBAPlayer> candidates = new HashSet<NBAPlayer>();

        candidates.add(new NBAPlayer("durant2013", 32, 7.4, 5.5, 1.3, 0.7, 38.5, 59, 19.2));
        candidates.add(new NBAPlayer("curry2015", 30.1, 5.4, 6.7, 2.1, 0.2, 34.2, 73, 17.9));
        candidates.add(new NBAPlayer("harden17", 30.4, 5.4, 8.8, 1.8, 0.7, 35.4, 65, 15.4));
        candidates.add(new NBAPlayer("giannis18", 27.7, 12.5, 5.9, 1.3, 1.5, 32.8, 60, 14.4));
        candidates.add(new NBAPlayer("lebron2017", 27.5, 8.6, 9.1, 1.4, 0.9, 36.9, 50, 14));
        candidates.add(new NBAPlayer("drose2011", 25, 4.1, 7.7, 1.0, 0.6, 37.4, 62, 13.1));
        candidates.add(new NBAPlayer("lebron2012", 26.8, 8, 7.3, 1.7, 0.9, 37.9, 66, 19.3));

        List<NBAPlayer> myList = new ArrayList<NBAPlayer>(candidates);
        Collections.sort(myList);
        order(myList);
        System.out.println("\n" + "THE BEST MVP IS: " + "\n" + myList.get(myList.size()-1));

    }

    public static void order(List<NBAPlayer> myList){
        List<NBAPlayer> reversed = new ArrayList<NBAPlayer>();
        for (int i = myList.size(); i>=1; i--){
            reversed.add(myList.get(i-1));
        }
        myList = reversed;
        for (int i = 1; i<=myList.size(); i++){
            System.out.println(i + ". " + myList.get(i-1));
        }
    }
}
