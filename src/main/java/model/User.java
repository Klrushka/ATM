package model;

public class User {
    private double usdBill;
    private double eurBill;
    private double rubBill;

    public User(double usdBill, double eurBill, double rubBill) {
        this.usdBill = usdBill;
        this.eurBill = eurBill;
        this.rubBill = rubBill;
    }

    public double getUsdBill() {
        return usdBill;
    }

    public double getEurBill() {
        return eurBill;
    }

    public void setEurBill(double eurBill) {
        if (eurBill > this.eurBill) {
            System.out.println("Invalid operation");
            return;
        }
        this.eurBill = eurBill;
    }

    public double getRubBill() {
        return rubBill;
    }

    public void setRubBill(double rubBill) {
        if (rubBill > this.rubBill) {
            System.out.println("Invalid operation");
            return;
        }
        this.rubBill = rubBill;
    }

    public void setUsdBill(double usdBill) {
        if (usdBill > this.usdBill) {
            System.out.println("Invalid operation");
            return;
        }
        this.usdBill = usdBill;
    }

    @Override
    public String toString() {
        return "usdBill=" + usdBill +
                ", eurBill=" + eurBill +
                ", rubBill=" + rubBill;
    }
}
