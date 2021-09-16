package services;

import model.User;


public enum Service {
    INFO("Info"){
        public void info(User user){
            System.out.println(user);
        }
    },
    CASH_WITHDRAWAL("Cash withdrawal"){
        public void cashWithdrawal(AtmCurrency currency, User user, double value){
            switch (currency){
                case USD:
                    user.setUsdBill(user.getUsdBill() - value);
                    break;
                case EUR:
                    user.setEurBill(user.getEurBill() - value);
                    break;
                case RUB:
                    user.setRubBill(user.getRubBill()- value);
                    break;
            }
        }
    },
    ;

    private String value;

    Service(String value) {
        this.value = value;
    }

    public void info(User user){

    }

    public void cashWithdrawal(AtmCurrency currency, User user, double value){

    }

    public String getValue() {
        return value;
    }
}
