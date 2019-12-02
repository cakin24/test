package DataBaseProxy;

public class orderService implements IOrderService {
    private orderDao orderDao;

    public orderService(){
        orderDao = new orderDao();
    }


    public int createOrder(Order order){
        System.out.println("orderService调用orderDao创建订单");
        return orderDao.insert(order);
    }
}
