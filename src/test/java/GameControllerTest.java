import org.example.GameController;
import org.example.GameRules;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Random;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GameControllerTest {

    private GameController gameController;
    private GameRules gameRules;
    private Scanner scanner;
    private Random random;

    @BeforeEach
    public void setUp() {
        gameRules = new GameRules();
        scanner = new Scanner(System.in);
        random = new Random();
        gameController = new GameController(scanner, random, gameRules);
    }


    @Test
    public void testPlay_randomIsNotNull() {
        assertNotNull(gameController.getRandom());
    }
}




