package Delegate;

import java.util.HashMap;
import java.util.Map;

public class Leader implements IEmployee{
    private Map<String,IEmployee> targets = new HashMap<String,IEmployee>();

    public Leader(){
        targets.put("加密",new EmpolyeeA());
        targets.put("登录",new EmpolyeeB());
    }
    @Override
    public void doing( String command ) {
        targets.get(command).doing(command);
    }
}
