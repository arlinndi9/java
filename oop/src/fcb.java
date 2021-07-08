public class fcb {

    public static void main(String[] args) {
        Player[] players = {new Player("Lionel Messi", 23, 10), new Player("Luis Suarez", 18, 10), new Player("Andres Iniesta", 10, 19)};
        FcbStatsCalculator fcbCalc = new FcbStatsCalculator();
        fcbCalc.showPlayers(players);
        System.out.println("Total goals " + fcbCalc.sumGoalsOrAssists(players, "goals"));
        System.out.println("Total assists " + fcbCalc.sumGoalsOrAssists(players, "assists"));

        double avgGoals = fcbCalc.avgGoalsOrAssists(fcbCalc.sumGoalsOrAssists(players, "goals"), players.length);
        System.out.println(avgGoals);


    }
}
