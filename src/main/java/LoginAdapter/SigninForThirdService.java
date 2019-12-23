package LoginAdapter;

public class SigninForThirdService extends SiginService{
    public ResultMsg loginForQQ(String openId){
        return loginForRegister(openId,null);
    }

    public ResultMsg loginForWechat(String openId){
        return null;
    }

    public ResultMsg loginFortoken(String token){
        return null;
    }

    public ResultMsg loginForphone(String telphone,String code){
        return null;
    }

    public ResultMsg loginForRegister(String username,String password){
        super.register(username,null);
        return super.login(username,null);
    }
}
