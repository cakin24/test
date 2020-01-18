package HashAlgorithm;

import org.apache.commons.lang.StringUtils;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Copyright (C), 2020-2020, XXX有限公司
 * FileName: HashAlgorithm
 * Author:   cakin
 * Date:     2020/1/18
 * Description: 消息摘要算法
 */
public class HashAlgorithm {
    public static void main( String[] args )  {
        String testString;
        testString = getDigestResult("testString","SHA-512");
        System.out.println(testString);
        // 返回512bit
        // c48af5a7f6d4a851fc8a434eed638ab1a6ef68e19dbcae894ac67c9fbc5bcb0182b8e7123b3df3c9e4dcb7690c23103f03dc17f54352071ceb2a4eb204b26b91
    }
    public static String getDigestResult(String inputStr,String hashAlgorithm)  {
        MessageDigest messageDigest;
        String reslutStr = null;
        // 获得某种摘要，例如hashAlgorithm可取为SHA-512
        try {
            // Oracle's JVM supports MD2, MD5, SHA-1, SHA-256, SHA-384, and SHA-512
            // 返回实现指定摘要算法的MessageDigest对象。
            messageDigest = MessageDigest.getInstance(hashAlgorithm);

            // inputStr不能为空
            if(StringUtils.isNotEmpty(inputStr)){
                // 使用指定的字节更新摘要。
                messageDigest.update(inputStr.getBytes("UTF-8"));
                // 将bytes数组转换为BigInterger类型。1，表示 +，即正数。
                BigInteger bigInteger = new BigInteger(1,messageDigest.digest());
                reslutStr = bigInteger.toString(16);
            }else {
                System.out.println("getDigestResult function param inputstr is null");
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return reslutStr;
    }
}
