package promotion;

public class Test3 {
    public static void main( String[] args ) {
        String promotionKey = "GROUPBUY";
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrtety(promotionKey));
        promotionActivity.execute();
    }
}
