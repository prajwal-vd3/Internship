class Assignment{
    public static void main(String[] args) {
        
        //Task 1 : Program to print the numbers from 10 to 50 for loop/while loop
        for(int i=10 ; i<=50 ; i++){
            System.out.println(i+"");
        }

        //Task 2 : Program to reverse the given number using loops
        int num = 876;
        int rev = 0;
        while(num != 0){
            int mod = num % 10;
            rev = rev * 10 + mod;
            num = num/10;
        }
        System.out.println("Reversed number is : "+rev);

        //Task 2 : Program to check whether given number is positive
        int num1 = 123;
        if(num1 >= 0)
            System.out.println("Positive");
        else
            System.out.println("Positive");
    }
}