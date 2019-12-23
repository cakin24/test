package LoginAdapter;

public class SiginService {
    public ResultMsg register(String username,String password){
        return new ResultMsg(200,"注册成功",new Member());
    }

    public ResultMsg login(String username,String password){
        return null;
    }
}
