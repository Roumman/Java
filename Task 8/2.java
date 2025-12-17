interface Discount {
    double apply(double price);
}

class NoDiscount implements Discount {
    @Override
    public double apply(double price) {
        return price;
    }
}

class PercentDiscount implements Discount {
    private final int percent;

    PercentDiscount(int percent) {
        this.percent = percent;
    }

    @Override
    public double apply(double price) {
        return price - price * percent / 100.0;
    }
}

class FixedDiscount implements Discount {
    private final double amount;

    FixedDiscount(double amount) {
        this.amount = amount;
    }

    @Override
    public double apply(double price) {
        return price - amount;
    }
}

class PriceCalculator {
    private final Discount discount;

    public PriceCalculator(Discount discount) {
        this.discount = discount;
    }

    public double calculate(double price) {
        return discount.apply(price);
    }
}
