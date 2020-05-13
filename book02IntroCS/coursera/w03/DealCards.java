package w03;

/**
 * Created by AZ 2020-05-12
 */

public class DealCards {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        String[] rank = {"2",
                "3",
                "4",
                "5",
                "6",
                "7",
                "8",
                "9",
                "10",
                "J",
                "Q",
                "K",
                "A"
        };
        String[] suit ={"Clubs",
                "Diamonds",
                "Hearts",
                "Spades"
        };
        String[] deck = new String[52];
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 13; i++) {
                deck[i + 13*j] = rank[i] + suit[j];
            }

        }
        for (int i = 0; i < 52; i++) {
            int r = i + (int) (Math.random() * (52 - i));
            String t = deck[r];
            deck[r]=deck[i];
            deck[i]= t;

        }
        for (int i = 0; i < N; i++) {
            System.out.println(deck[i]);
        }
        System.out.println();
    }
}
