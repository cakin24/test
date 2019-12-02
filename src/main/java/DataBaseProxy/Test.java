package DataBaseProxy;

import javafx.application.Application;
import javafx.stage.Stage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test extends Application {

    public static void main( String[] args ) {
        try{
            Order order = new Order();
            SimpleDateFormat sdf= new SimpleDateFormat("yyyy/MM/dd");
            Date date = sdf.parse("2019/12/3");
            order.setCreateTime(date.getTime());

            IOrderService orderService = new OrderServiceStaticProxy(new orderService());
            orderService.createOrder(order);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void start( Stage primaryStage ) {

    }
}
