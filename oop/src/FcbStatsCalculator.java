public class FcbStatsCalculator {
    public void showPlayers(Player[] players) {
        for (Player player : players) {
            System.out.println("Player: " + player.getName() + " has " + player.getGoals() + " goals and " + player.getAssists());
        }
    }

    public int sumGoalsOrAssists(Player[] players, String type) {
        int total = 0;
        for (Player player : players) {
            if (type.equals("assists")) {
                total = total + player.getAssists();
            } else {
                total = total + player.getGoals();
            }
        }
        return total;
    }

    public double avgGoalsOrAssists(int total, int totalPlayer) {
        return (double) total / totalPlayer;
    }

}
