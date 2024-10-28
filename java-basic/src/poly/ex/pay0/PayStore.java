package poly.ex.pay0;

import poly.ex.pay1.*;
import poly.ex.pay1.KaKaoPay;
import poly.ex.pay1.NaverPay;

public abstract class PayStore {

    //변하는 부분
    public static Pay findPay(String option) {
        if (option.equals("kakao")) {
            return new KaKaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else if (option.equals("new")) {
            return new NewPay();
        } else {
            return new DefaultPay();
        }
    }
}
