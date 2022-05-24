package org.example;

import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {

    private List<Movable> herdList;

    public Herd(){
        this.herdList = new ArrayList<>();
    }
    public void addToHerd(Movable movable){
        herdList.add(movable);
    }

    @Override
    public void move(int dx, int dy){
        for(Movable moveHerd : herdList){
            moveHerd.move(dx,dy);
        }
    }



    @Override
    public String toString(){
        String list = "";
        for (Movable move : herdList) {
            list += move.toString() + "\n";
        }
        return list;
    }
}
