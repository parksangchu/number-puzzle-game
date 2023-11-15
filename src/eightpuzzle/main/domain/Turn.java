package eightpuzzle.main.domain;

public class Turn {
    private int turn = 1;

    public void increaseTurn() {
        turn++;
    }

    public int getTurn() {
        return turn;
    }

}
