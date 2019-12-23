package LoginAdapter;

public class Test2 {
    public static void main( String[] args ) {
        IPassportForThird passportForThird = new PassportForThirdAdapter();
        passportForThird.loginForQQ("");
    }
}
