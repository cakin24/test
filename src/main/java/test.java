import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class test {

    public static void main( String[] args ) {
        String fileName = "中国";
        System.out.println(fileName);
        try {
            String downloadName = URLEncoder.encode(fileName, "UTF-8");
            System.out.println(downloadName);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }


}
