import java.util.Scanner;

class MaxNum {

    int num1, num2, num3;

    public MaxNum(int n1, int n2, int n3) {
        this.num1 = n1;
        this.num2 = n2;
        this.num3 = n3;
    }

    public void calculateAndDisplayMax() {

        int max;

        if (num1 >= num2 && num1 >= num3) {
            max = num1;
        } 
        else if (num2 >= num1 && num2 >= num3) {
            max = num2;
        } 
        else {
            max = num3;
        }

        System.out.println("The maximum number among " 
                + num1 + ", " + num2 + ", and " + num3 
                + " is: " + max);
    }
}

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int n3 = sc.nextInt();

        MaxNum obj = new MaxNum(n1, n2, n3);
        obj.calculateAndDisplayMax();

        sc.close();
    }
}
