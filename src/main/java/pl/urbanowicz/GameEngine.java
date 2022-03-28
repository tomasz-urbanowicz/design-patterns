package pl.urbanowicz;

import java.io.Serializable;

public class GameEngine implements Serializable {

    private static final long serialVersionUID = 23232323;

    private int hp = 100;
    private String characterName = "";

    private static GameEngine instance;

    private GameEngine() {

    }

    public static GameEngine getInstance() {
        if (instance == null) {
            instance = new GameEngine();
        }
        return instance;
    }
}
