package DataBaseProxy;

import java.text.SimpleDateFormat;
import java.util.Date;



public class OrderServiceStaticProxy implements IOrderService{

    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");

    private IOrderService orderService;

    public OrderServiceStaticProxy(IOrderService orderService){
        this.orderService = orderService;
    }


    private void before(){
        System.out.println("Proxy before method");
    }

    private void after(){
        System.out.println("Proxy after method");
    }

    public int createOrder( Order order ) {
        before();
        Long time=order.getCreateTime();
        Integer dbRoute = Integer.valueOf(yearFormat.format(new Date(time)));
        System.out.println("静态代理类自动分配到【DB_"+dbRoute+"】数据源处理数据");
        DynamicDataSourcrEntry.set(dbRoute);
        orderService.createOrder(order);
        after();
        return 0;
    }
}
