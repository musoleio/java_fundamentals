package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LotteryQuickPick {
    public static final int LENGTH = 6;

    public static void main(String[] args) {
        int[] lotteryTicket = generateTicket();
        printTicket(lotteryTicket);
    }

    private static int getRandomTicketNumber(int from, int to) {
        Random random = new Random();
        return random.nextInt(from, to);
    }

    private static int[] generateTicket() {
        int[] ticket = new int[LENGTH];
        for (int i = 0; i < LENGTH; i++) {
            var randomNumber = getRandomTicketNumber(1, 69);
            var exists = search(ticket, randomNumber);
            do {
                randomNumber = getRandomTicketNumber(1, 69);
            } while (exists);
            ticket[i] = randomNumber;
        }

        return ticket;
    }

    private static Set<Integer> generateTicket2() {
        Set<Integer> ticket2 = new HashSet<>();
        for (int i = 0; i < LENGTH; i++) {
            var randomNumber = getRandomTicketNumber(1, 69);
            while (!ticket2.add(getRandomTicketNumber(1, 69))) ;
        }
        return ticket2;
    }

    private static boolean search(int arr[], int item) {
        for (int value : arr) {
            if (value == item) return true;
        }
        return false;
    }

    public static void printTicket(int[] ticket) {
        Arrays.sort(ticket);
//        for (int value : ticket)
//            System.out.print(value + " | ");

        for (int i = 0; i < ticket.length; i++) {
            System.out.print(ticket[i]);
            if (i != ticket.length - 1)
                System.out.print(" | ");
        }
    }
}
