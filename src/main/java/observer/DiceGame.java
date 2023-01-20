package observer;

import java.util.LinkedList;

public abstract class DiceGame {
    // protected => 자식도 이 필드에 접근할 수 있도록 한다.
    protected LinkedList<Player> players = new LinkedList<>();

    public void addPlayer(Player player) {
        players.add(player);
    }

    public abstract void play();
}
