public class FeeDiscount {
    public static void main(String[] args) {
        int fee = 125000, discountPercent = 10;
        double discount = ((double)fee*discountPercent)/100;
        double feeRequired = fee - discount;

        System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+feeRequired);

    }
}
