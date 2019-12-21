package DataDynamicProxy;

public class OrderDao {
    public int insert(Order order){
        System.out.println("orderDao创建Order成功！");
        return 1;
    }
}
