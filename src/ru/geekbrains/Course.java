package ru.geekbrains;

public class Course {

    private Obstacle[] obstacles;

    public Course(Obstacle... obstacles){
        this.obstacles = obstacles;
    }

    public void doIt(Team testTeam){
        for (Competitor everyTeamMember : testTeam.getCompetitors()){
            for (Obstacle everyBarrier : obstacles){
                everyBarrier.doIt(everyTeamMember);
                if (!everyTeamMember.isOnDistance()) break;
            }
        }
    }

}
