public class LazySimpleSingleton {
    private LazySimpleSingleton(){}
    private static LazySimpleSingleton lazy = null;

    public static LazySimpleSingleton getInstance() {
        if(lazy == null)
        {
            lazy=new LazySimpleSingleton();
            System.out.println("test");
            System.out.println("test");
            System.out.println("test");
            System.out.println("test");
        }
        return lazy;
    }
}
