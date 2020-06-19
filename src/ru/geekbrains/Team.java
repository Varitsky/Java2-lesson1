package ru.geekbrains;

public class Team {

    private String teamName;
    private Competitor[] competitors;

    public String getTeamName() {
        return teamName;
    }
    public Competitor[] getCompetitors() {
        return competitors;
    }

    public Team(String teamName, Competitor... competitors) {
        this.teamName = teamName;
        this.competitors = competitors;
    }

    public void showResults() {
        System.out.print("Результаты команды " + teamName+": "+"\n");
        for (Competitor everyCompepitor : competitors) {
            everyCompepitor.result();
        }
    }

}


