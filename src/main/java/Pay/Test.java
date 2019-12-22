package Pay;

public class Test {
    public static void main( String[] args ) {
        Order order = new Order("1","563487548",43.6);
        System.out.println(order.pay(PayStrategy.ALI_PAY));
    }
}
