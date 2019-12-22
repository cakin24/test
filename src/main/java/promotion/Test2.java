package promotion;
import org.apache.commons.lang.StringUtils;


public class Test2 {
    public static void main( String[] args ) {
        PromotionActivity promotionActivity = null;
        String promotionkey = "COUPON";
        if(StringUtils.equals(promotionkey,"COUPON")){
            promotionActivity = new PromotionActivity(new CouponStrategy());

        }else if(StringUtils.equals(promotionkey,"CASHBACK")){
            promotionActivity = new PromotionActivity(new CashbackStrategy());
        }
        promotionActivity.execute();
    }
}
