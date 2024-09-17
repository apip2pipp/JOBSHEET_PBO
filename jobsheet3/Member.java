package jobsheet3;
public class Member {
    private String idCardNumber;
    private String name;
    private int limitLoan;
    private int currentLoan;

    // Constructor
    public Member(String idCardNumber, String name, int limitLoan) {
        this.idCardNumber = idCardNumber;
        this.name = name;
        this.limitLoan = limitLoan;
        this.currentLoan = 0; // Default initial loan is 0
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for loan limit
    public int getLimitLoan() {
        return limitLoan;
    }

    // Getter for current loan amount
    public int getCurrentLoan() {
        return currentLoan;
    }

    // Method to borrow money
    public void borrow(int amount) {
        if ((currentLoan + amount) > limitLoan) {
            System.out.println("Sorry, the loan amount exceeds the limit.");
        } else {
            currentLoan += amount;
        }
    }

    // Method to pay installments
    public void installment(int amount) {
        int minimumInstallment = (int) (0.1 * currentLoan); // 10% of current loan
        if (amount < minimumInstallment) {
            System.out.println("Sorry, the installment must be at least 10% of the loan amount.");
        } else if (amount > currentLoan) {
            currentLoan = 0;  // Loan is fully paid
        } else {
            currentLoan -= amount;
        }
    }
}
