class second {
    public static void main(String[] args) {

        int num =121,sum = 0, r;


        int originalNum = num;


        while (num != 0) {
            r = num % 10;
            sum = sum * 10 + r;
            num =num/10;
        }


        if (originalNum == sum) {
            System.out.println(originalNum + " is Palindrome.");
        }
        else {
            System.out.println(originalNum + " is not Palindrome.");
        }
    }
}