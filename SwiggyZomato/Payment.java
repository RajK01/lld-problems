package SwiggyZomato;

public class Payment {
    private String paymentId;
    private String orderId;
    private double amnt;
    private String status;

    public Payment(String payementId, String orderId, double amnt, String status) {
        this.paymentId = payementId;
        this.orderId = orderId;
        this.amnt = amnt;
        this.status = status;
    }

    public void initiatePayment(double amnt) {
        
    }
}