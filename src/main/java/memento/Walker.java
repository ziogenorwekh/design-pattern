package memento;

import java.util.ArrayList;

public class Walker {

    // 현재 위치에 대한 좌표
    private int currentX, currentY;
    // 도달해야할 좌표
    private int targetX, targetY;
    // 어떤 액션을 취해야 할지 순서대로 저장하기 위한 객체
    private ArrayList<String> actionList = new ArrayList<>();

    public Walker(int currentX, int currentY, int targetX, int targetY) {
        this.currentX = currentX;
        this.currentY = currentY;
        this.targetX = targetX;
        this.targetY = targetY;
    }

    public double walk(String action) {
        actionList.add(action);

        switch (action) {
            case "UP" -> currentY += 1;
            case "RIGHT" -> currentX += 1;
            case "DOWN" -> currentY -= 1;
            case "LEFT" -> currentX -= 1;
        }

        return Math.sqrt(Math.pow(currentX - targetX, 2) + Math.pow(currentY - targetY, 2));
    }

    public class Memento {
        private int x, y;
        private ArrayList<String> actionList;

        private Memento() {

        }
    }

    public Memento createMemento() {
        Memento memento = new Memento();
        memento.x = this.currentX;
        memento.y = this.currentY;
        memento.actionList = (ArrayList<String>) this.actionList.clone();

        return memento;
    }

    public void restoreMemento(Memento memento) {
        this.currentX = memento.x;
        this.currentY = memento.y;
        this.actionList = (ArrayList<String>) memento.actionList.clone();
    }

    @Override
    public String toString() {
        return actionList.toString();
    }
}
