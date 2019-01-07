

import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        // System objects
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        // Game variables
        String[] enemies = {"Skeleton", "Zombie", "Warrior", "Assassin"};
        int maxEnemyHealth = 50;
        int enemyAttackDamage = 25;

        // Player variables
        int health = 100;
        int attackDamage = 50;
        int numHealthPotions = 3;
        int healthPotionHealAmount = 30;
        int healthPotionDropChance = 50; // Percentage

        // Player XP
        int xp = 0;
        int gainedXp = 10;

        // Player level
        int level = 1;
        int levelUp;

        boolean running = true;

        System.out.print("Enter player name: ");
        String playerName = in.next();
        System.out.println("Welcome " + playerName);

        GAME:
        while (running) {

            System.out.println("--------------------------------");
        }
    }
}
