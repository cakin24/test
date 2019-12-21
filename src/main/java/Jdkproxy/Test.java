package Jdkproxy;

public class Test {
    public static void main(String[] args){
        try {
            Person obj = (Person)new JDKMeipo().getInstance(new Customer());
            obj.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
