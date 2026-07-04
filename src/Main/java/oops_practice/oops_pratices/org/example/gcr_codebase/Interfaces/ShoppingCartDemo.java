package Main.java.oops_practice.oops_pratices.org.example.gcr_codebase.Interfaces;

interface CouponValidator {

    void validateCoupon(String code);

    static boolean isLengthValid(String code) {
        return code.length() >= 5 && code.length() <= 10;
    }
}

class ShoppingCart implements CouponValidator {

    @Override
    public void validateCoupon(String code) {
        if (CouponValidator.isLengthValid(code)) {
            System.out.println(code + " -> Valid Coupon");
        } else {
            System.out.println(code + " -> Invalid Coupon");
        }
    }
}

public class ShoppingCartDemo {

    public static void main(String[] args) {

        String[] coupons = {
                "SAVE10",
                "AB12",
                "WELCOME",
                "BIGSALE2025",
                "DISC5"
        };

        ShoppingCart cart = new ShoppingCart();

        System.out.println("Coupon Validation:");

        for (String coupon : coupons) {
            cart.validateCoupon(coupon);
        }
    }
}