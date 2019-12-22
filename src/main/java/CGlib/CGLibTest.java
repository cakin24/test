package CGlib;

import net.sf.cglib.core.DebuggingClassWriter;

public class CGLibTest {
    public static void main(String[] args){
        try {
            System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"E://cglib_proxy_class/");
            Customer obj = (Customer)new CglibMeipo().getInstance(Customer.class);
            obj.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
