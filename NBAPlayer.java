public class NBAPlayer implements Comparable<NBAPlayer> {

    String name;
    double ppg;
    int teamWins;
    double winShares;
    double apg;
    double rpg;
    double spg;
    double bpg;
    double minutes;

    public NBAPlayer(String name, double ppg, double rpg, double apg, double spg, double bpg, double minutes, int teamWins, double winShares){
        super();
        this.name = name;
        this.ppg = ppg;
        this.apg = apg;
        this.rpg = rpg;
        this.spg = spg;
        this.bpg = bpg;
        this.minutes = minutes;
        this.teamWins = teamWins;
        this.winShares = winShares;
    }

    @Override
    public int compareTo(NBAPlayer o) {
        double MVPvalue1 = ((0.3*(this.ppg))+(0.25*(this.teamWins))+(0.2*(this.winShares))+(0.05*(this.apg))+(0.05*(this.rpg))+(0.05*(this.bpg))+(0.05*(this.spg))+(0.05*(this.minutes)));
        double MVPvalue2 = ((0.3*(o.ppg))+(0.25*(o.teamWins))+(0.2*(o.winShares))+(0.05*(o.apg))+(0.05*(o.rpg))+(0.05*(o.bpg))+(0.05*(o.spg))+(0.05*(o.minutes)));
        if (MVPvalue1 < MVPvalue2){
            return -1;
        }
        else if (MVPvalue1 > MVPvalue2){
            return 1;
        }
        return 0;
    }



    @Override
    public String toString() {

        return  name.toUpperCase()  +
                " averages " + ppg + " points per game " +
                "and his team has won " + teamWins + " games during the season.\n";
    }
}
