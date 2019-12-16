package ru.progwards.java1.SeaBattle.batishta_83;

import ru.progwards.java1.SeaBattle.SeaBattle;

public class SeaBattleAlg {
public void battleAlgorithm(SeaBattle seaBattle){
    for(int x=0; x<seaBattle.getSizeX();x++){
        for(int y=0; y<seaBattle.getSizeY();y++){
            SeaBattle.FireResult fireResult = seaBattle.fire(x,y);
        }
    }
}

    public static void main(String[] args) {
        System.out.println("Sea battle");
        SeaBattle seaBattle = new SeaBattle(true);
        new SeaBattleAlg().battleAlgorithm(seaBattle);
        System.out.println(seaBattle);
        System.out.println(seaBattle.getResult());
    }
}
