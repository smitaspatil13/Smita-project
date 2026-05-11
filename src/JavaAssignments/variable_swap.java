package JavaAssignments;

class variable_swap{
    public void main(String[] args) {
        int a = 45;
        int b = 78;

        System.out.println("Before Swapping: a = " + a + ", b = " + b);

        // Step 1: Add both values (a becomes the sum)
        a = a + b;

        // Step 2: Subtract original b from sum to get original a
        b = a - b;

        // Step 3: Subtract new b (original a) from sum to get original b
        a = a - b;

        System.out.println("After Swapping:  a = " + a + ", b = " + b);
    }
}
