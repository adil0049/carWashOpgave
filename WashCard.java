public class WashCard {
    private String customerName; 
    private double amount; 

    public WashCard(String customerName, double amount) {
        this.customerName = customerName;
        this.amount = amount;
    }
    
    public void setAmount(double amount) {
        this.amount = amount; 
    }
    public String getCustomerName() {
        return customerName;
    }
    public double getAmount() {
        return amount;
    }
}