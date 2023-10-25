import planet.Mars;

import java.util.ArrayList;

public class Team {
    // --- variable
    private String teamName;
    private Astronaut astronaut;
    private ArrayList<Astronaut> teamList = new ArrayList<>();
    public Team(String name){
        this.teamName = name;
    }

    // --- getter, setter
    public String getName(){
        return teamName;
    }

    // -- Methods
    public void add(Astronaut params){
        teamList.add(params);
    }
    public void remove(Astronaut params){
        teamList.remove(params);
    }
    public int countMembers(){
        return teamList.size();
    }
    public void showMembers(){
        StringBuilder command = new StringBuilder();
        command.append(getName()).append(": ");

        for (int i = 0; i < teamList.size(); i++) {
            if (i == teamList.size() - 1) {
                if(teamList.get(i).getDestination() == null){
                    command.append(teamList.get(i).getName()).append(" on standby.");
                }else{
                    command.append(teamList.get(i).getName()).append(" on mission.");
                }
            }else{
                if(teamList.get(i).getDestination() == null){
                    command.append(teamList.get(i).getName()).append(" on standby, ");
                }else{
                    command.append(teamList.get(i).getName()).append(" on mission, ");
                }
            }
        }
        System.out.println(command);
    }
    public void doActions(){
        for(Astronaut astronaut : teamList){
            astronaut.doAction();
        }
        System.out.println(getName()+": Nothing to do.");
    }
    public void doActions(planet.Mars params){
        for(Astronaut astronaut : teamList){
            astronaut.doAction(params);
        }
        System.out.println(getName() + ": Started a mission!");
    }
    public void doActions(chocolate.Mars params){
        for(Astronaut astronaut : teamList){
            astronaut.doAction(params);
        }
        System.out.println(getName() + ": Sharing a chocolate.");
    }
}
