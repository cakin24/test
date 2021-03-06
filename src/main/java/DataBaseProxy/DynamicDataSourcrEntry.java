package DataBaseProxy;

public class DynamicDataSourcrEntry {
    public final static String DEDAULT_SOURCE = null;

    private final static ThreadLocal<String> local = new ThreadLocal<String>();

    private DynamicDataSourcrEntry(){
    }

    public static void clear(){
        local.remove();
    }

    public static String get(){
        return local.get();
    }

    public static void restore(){
        local.set(DEDAULT_SOURCE);
    }

    public static void set(String source){
        local.set(source);
    }

    public static void set(int year){
        local.set("DB_"+year);
    }

}
