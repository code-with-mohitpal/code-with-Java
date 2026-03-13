abstract class Account {
    String accountHolder;
    double principalAmount;

    Account(String accountHolder, double principalAmount) {
        this.accountHolder = accountHolder;
        this.principalAmount = principalAmount;
    }

    abstract double calculateInterest();
}

class FixedDeposit extends Account {
    int duration;
    double rate;

    FixedDeposit(String accountHolder, double principalAmount, int duration, double rate) {
        super(accountHolder, principalAmount);
        this.duration = duration;
        this.rate = rate;
    }

    double calculateInterest() {
        return (principalAmount * duration * rate) / 100;
    }
}

class RecurringDeposit extends Account {
    int monthlyDeposit;
    int duration;
    double rate;

    RecurringDeposit(String accountHolder, double principalAmount, int monthlyDeposit, int duration, double rate) {
        super(accountHolder, principalAmount);
        this.monthlyDeposit = monthlyDeposit;
        this.duration = duration;
        this.rate = rate;
    }

    double calculateInterest() {
        double maturity = monthlyDeposit * duration;
        return (maturity * duration * rate) / (12 * 100);
    }
}
