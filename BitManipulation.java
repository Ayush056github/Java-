// 
public class BitManipulation {

    /**
     * Checks if the bit at a specific position is set (1) or unset (0).
     * @param num The number to check.
     * @param pos The position (0-indexed from the right) of the bit.
     * @return true if the bit is set, false otherwise.
     */
    public static boolean getBit(int num, int pos) {
        // Create a mask with 1 at the 'pos' position (1 << pos).
        // Perform bitwise AND with the number. If result is non-zero, the bit was set.
        return ((num & (1 << pos)) != 0);
    }

    /**
     * Sets the bit at a specific position to 1.
     * @param num The number to modify.
     * @param pos The position (0-indexed from the right) of the bit.
     * @return The updated number with the bit set.
     */
    public static int setBit(int num, int pos) {
        // Create a mask with 1 at the 'pos' position (1 << pos).
        // Perform bitwise OR with the number. This forces the 'pos' bit to 1.
        return num | (1 << pos);
    }

    /**
     * Clears (unsets) the bit at a specific position to 0.
     * @param num The number to modify.
     * @param pos The position (0-indexed from the right) of the bit.
     * @return The updated number with the bit cleared.
     */
    public static int clearBit(int num, int pos) {
        // Create a mask with 1 at the 'pos' position (1 << pos).
        // Use the complement operator (~) to create a mask with 0 at the 'pos' position and 1 everywhere else.
        // Perform bitwise AND with the number. This forces the 'pos' bit to 0.
        int mask = ~(1 << pos);
        return num & mask;
    }

    /**
     * Toggles (flips) the bit at a specific position (1 becomes 0, 0 becomes 1).
     * @param num The number to modify.
     * @param pos The position (0-indexed from the right) of the bit.
     * @return The updated number with the bit toggled.
     */
    public static int toggleBit(int num, int pos) {
        // Create a mask with 1 at the 'pos' position (1 << pos).
        // Perform bitwise XOR with the number. XOR with 1 flips the bit, XOR with 0 leaves it unchanged.
        return num ^ (1 << pos);
    }

    /**
     * Counts the number of set bits (1s) in the binary representation of a number.
     * This uses the Brian Kernighan algorithm, which runs in O(count of set bits) time.
     * @param n The number.
     * @return The count of set bits.
     */
    public static int countSetBits(int n) {
        int count = 0;
        while (n != 0) {
            // n &= (n - 1) unsets the rightmost set bit in n.
            n &= (n - 1);
            count++;
        }
        return count;
    }

    /**
     * Checks if a given positive integer is a power of two.
     * @param x The number to check.
     * @return true if the number is a power of two, false otherwise.
     */
    public static boolean isPowerOfTwo(int x) {
        // A power of two has only one set bit in its binary representation.
        // x & (x - 1) will be 0 if only one bit is set.
        return (x > 0) && ((x & (x - 1)) == 0);
    }

    public static void main(String[] args) {
        int n = 20; // Binary: 010100
        int pos = 2;

        System.out.println("Original number: " + n + " (Binary: " + Integer.toBinaryString(n) + ")");
        System.out.println("Bit at position " + pos + " is set: " + getBit(n, pos));

        int setNum = setBit(n, 0); // Set the 0th bit (LSB)
        System.out.println("Number after setting bit at position 0: " + setNum + " (Binary: " + Integer.toBinaryString(setNum) + ")");

        int clearNum = clearBit(n, 4); // Clear the 4th bit
        System.out.println("Number after clearing bit at position 4: " + clearNum + " (Binary: " + Integer.toBinaryString(clearNum) + ")");

        int toggleNum = toggleBit(n, 3); // Toggle the 3rd bit
        System.out.println("Number after toggling bit at position 3: " + toggleNum + " (Binary: " + Integer.toBinaryString(toggleNum) + ")");

        System.out.println("Count of set bits in " + n + ": " + countSetBits(n));

        int powerOfTwo = 16;
        System.out.println(powerOfTwo + " is a power of two: " + isPowerOfTwo(powerOfTwo));
        System.out.println(n + " is a power of two: " + isPowerOfTwo(n));
    }
}
