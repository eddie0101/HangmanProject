import java.util.Scanner;

public class Hangman {

    public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
    "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
    "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
    "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
    "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", 
    "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
    "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
    "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
    "wombat", "zebra"};

    public static String[] gallows = {"+---+\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|   |\n" +
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" +
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" +
    "/    |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + 
    "/ \\  |\n" +
    "     |\n" +
    " =========\n"};

    // ###############################################################################################
    // ###############################################################################################
    // ###############################################################################################

    public static void main(String[] args) {

        while (true) {
            clearScreen();
            printGame();
            inputLetter = scan.nextLine();
            
        }

    }

    // ###############################################################################################
    // ###############################################################################################
    // ###############################################################################################

    static Scanner scan = new Scanner(System.in);
    static String word = words[(int) (Math.random() * (words.length - 1))]; // generating a random word
    static String[] wordArray = word.split("");
    static int[] hiddenLetters = new int[words.length];
    static String misses = "";
    static String guess;
    static String inputLetter;

    public static void clearScreen() {
        System.out.print("\033[H\033[2J"); 
    }

    public static void printGame() {
        System.out.println(gallows[0]);
        System.out.print("Word: ");
        for (int i = 0; i < wordArray.length; i++) {
            if (hiddenLetters[i] == 0) {
                System.out.print("_ ");
            }
            else {
                System.out.println(wordArray[i] + " ");
            }
        }
        System.out.println();
        System.out.print("Misses: " + misses);
        System.out.println();
        System.out.print("Guess: ");
        
    }

}





