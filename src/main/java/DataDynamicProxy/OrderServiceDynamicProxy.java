package DataDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderServiceDynamicProxy implements InvocationHandler{
    private SimpleDateFormat yearFomat = new SimpleDateFormat("yyyy");
    private Object target;

    public Object getInstance(Object target){
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    public Object invoke( Object proxy, Method method, Object[] args ) throws Throwable{
        before(args[0]);
        Object object = method.invoke(target,args);
        after();
        return object;
    }

    private void before(Object target){
        try {
            System.out.println("Proxy before method.");
            Long time=(Long)target.getClass().getMethod("getCreateTime").invoke(target);
            Integer dbRoute = Integer.valueOf(yearFomat.format(new Date(time)));
            System.out.println("静态代理类自动分配到【DB_"+dbRoute+"】数据源处理数据");
            DynamicDataSourcrEntry.set(dbRoute);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void after(){
        System.out.println("Proxy after method.");
    }
}
