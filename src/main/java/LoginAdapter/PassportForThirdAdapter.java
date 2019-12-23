package LoginAdapter;

public class PassportForThirdAdapter extends SiginService implements IPassportForThird {
    @Override
    public ResultMsg loginForQQ( String id ) {
        return processLogin(id,LoginForQQAdapter.class);
    }

    @Override
    public ResultMsg loginForWechat( String id ) {
        return processLogin(id,LoginForWechatAdapter.class);
    }

    @Override
    public ResultMsg loginForToken( String token ) {
        return processLogin(token,LoginForTokenAdapter.class);
    }

    @Override
    public ResultMsg loginForTelphone( String telphone, String code ) {
        return processLogin(telphone,LoginForTelAdapter.class);
    }

    @Override
    public ResultMsg loginForRegist( String username, String passport ) {
        super.register(username,null);
        return processLogin(username,null);
    }

    private ResultMsg processLogin(String key,Class<? extends LoginAdapter> clazz){
        try {
            LoginAdapter adapter  = clazz.newInstance();
            if(adapter.support(adapter)){
                return adapter.login(key,adapter);
            }else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
