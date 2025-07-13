package org.example.practicinghardskills.thirdSetOfTasks;

public class GameSettings {
    private static int maxPlayers;
    private final String gameName;
    private int currentPlayers;

    public GameSettings(String gameName, int currentPlayers) {
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }

    public static void setMaxPlayers(int newMax){
        maxPlayers = newMax;
    }

    public void addPlayer(){
       if(currentPlayers < maxPlayers){
           currentPlayers = currentPlayers + 1;
       };
    }

    public void printGameStatus(){
        System.out.println("название: " + gameName + " количество игроков: " + currentPlayers + " максимальное количество: " + maxPlayers);
    }


}
