package AC220;

public class Test {
    public static void main( String[] args ) {
        DC5 dc5 = new PowerAdapter(new AC220());
        dc5.outputDC5V();
    }
}
