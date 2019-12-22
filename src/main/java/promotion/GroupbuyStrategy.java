package promotion;

public class GroupbuyStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("拼团，慢20人成团，全团享受团购价");
    }
}
