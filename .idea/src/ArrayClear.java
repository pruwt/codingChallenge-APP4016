public class ArrayClear {
    public static void main(String[] args) {
        String[] pallets = { "B14", "A11", "B12", "A13" };

        System.out.println("Before: " + pallets[0].toLowerCase());

        // Clearing elements from the array
        int index = 0;
        int length = 2;
        for (int i = index; i < index + length; i++) {
            pallets[i] = null;
        }

        if (pallets[0] != null) {
            System.out.println("After: " + pallets[0].toLowerCase());
        }

        System.out.println("Clearing 2 ... count: " + pallets.length);
        for (String pallet : pallets) {
            System.out.println("-- " + pallet);
        }
    }
}
