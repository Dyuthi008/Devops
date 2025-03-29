 class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String original = scanner.nextLine();
        scanner.close();

        String reversed = new StringBuilder(original).reverse().toString();

         if (original.equalsIgnoreCase(reversed)) {
            System.out.println("The string is a palindrome!");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }
    }
}
