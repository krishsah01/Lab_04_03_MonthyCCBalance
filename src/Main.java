public class Main
{
    public static void main(String[] args)
    {
        double cardBalance = 5000;
        double interestRate = 0.17;
        double interest = cardBalance * interestRate;
        cardBalance = cardBalance + interest;

        System.out.println("Interest due for month one is: $" + interest);
        interest = cardBalance * interestRate;
        System.out.println("Interest due for month two is: $" + interest);
    }
}