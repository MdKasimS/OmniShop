import java.time.LocalDate;

public class Discount {
    private double amount;
    private LocalDate startDate;
    private LocalDate endDate;

    // Constructor
    public Discount(double amount, LocalDate startDate, LocalDate endDate) {
        this.amount = amount;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Getters and setters
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    // Other methods...
}