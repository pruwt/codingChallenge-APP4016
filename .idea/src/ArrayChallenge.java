import java.util.Random;

public class ArrayChallenge {
    public static void main(String[] args) {
        String[] orderIds = {"B123", "C234", "A345", "C15", "B177", "G3003", "C235", "B179"};

        for (String item : orderIds) {
            char firstChar = item.charAt(0);
            switch (firstChar) {
                case 'B':
                    System.out.println(item);
                    break;
                // Add more cases for other letters if needed
            }
        }

        // Another array challenge
        Random random = new Random();
        String[] orderIDs = new String[5];

        for (int i = 0; i < orderIDs.length; i++) {
            int prefixValue = random.nextInt(5) + 65;
            char prefix = (char) prefixValue;
            String suffix = String.format("%03d", random.nextInt(1000));

            orderIDs[i] = prefix + suffix;
        }

        for (String orderID : orderIDs) {
            System.out.println(orderID);
        }
    }
}
