package cards.game;

public class DeckOfCards {

    public static void main(String[] args) {

        String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};

        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        String[][] player = new String[suit.length][rank.length];

        for (int k=1; k<5; k++) {
            System.out.println("Player "+k+" has Cards => ");
            for (int i = 0; i < 9; i++) {
                int randomSuit = (int) (Math.random() * 10) % 4;
                int randomRank = (int) (Math.random() * 100) % 13;
                player[randomSuit][randomRank] = rank[randomRank];
                switch (randomSuit) {
                    case 0:
                        System.out.println("Clubs - " + player[randomSuit][randomRank]);
                        break;
                    case 1:
                        System.out.println("Diamonds - " + player[randomSuit][randomRank]);
                        break;
                    case 2:
                        System.out.println("Hearts - " + player[randomSuit][randomRank]);
                        break;
                    case 3:
                        System.out.println("Spades - " + player[randomSuit][randomRank]);
                        break;
                }
            }
            System.out.println("\n");
        }
    }
}
