package Intro;

/**
 * @author Stephen
 * @date 2021-05-17 01:35
 **/
public class AliPay implements Mtwm {

    private String name;

    @Override
    public void payOnline() {
        //具体实现微信支付的功能：
        System.out.println("我已经点了外卖，我正在支付宝进行支付");
    }
}
