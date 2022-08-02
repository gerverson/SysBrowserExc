/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cypt.sys.browser.exc;

import java.awt.RenderingHints.Key;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.crypto.Cipher;
import sun.misc.BASE64Decoder;

/**
 *
 * @author 3240789
 */
public class url {
//   public static String encrypt(String Data) throws Exception {
//        Key key = generateKey();
//        Cipher c = Cipher.getInstance(ALGO);
//        c.init(Cipher.ENCRYPT_MODE, key);
//        byte[] encVal = c.doFinal(Data.getBytes());
//        String encryptedValue = new BASE64Encoder().encode(encVal);
//
//        String urlEncodeddata=URLEncoder.encode(encryptedValue,"UTF-8");
//        return urlEncodeddata;
//    }
//
//    @SuppressWarnings("restriction")
//    public static String decrypt(String encryptedData) throws Exception {
//        Key key = generateKey();
//        Cipher c = Cipher.getInstance(ALGO);
//        c.init(Cipher.DECRYPT_MODE, key);
//        String urlDecodedData=URLDecoder.decode(encryptedData, "UTF-8");
//        byte[] decordedValue = new BASE64Decoder().decodeBuffer(urlDecodedData);
//        byte[] decValue = c.doFinal(decordedValue);
//        String decryptedValue = new String(decValue);
//        return decryptedValue;
//    } 

    public static String encode(String stringData) {
        String encryptedString = stringData;
        byte[] encoded = Base64.getEncoder().encode(encryptedString.getBytes(StandardCharsets.UTF_8));
        String base64Encoded = new String(encoded);
        return base64Encoded;
    }

    public static String decode(String stringData) {
        byte[] decoded = Base64.getDecoder().decode(stringData.getBytes(StandardCharsets.UTF_8));
        String encryptedString = new String(decoded);
        return encryptedString;
    }
    
    public static void main(String[] args) {
        String Text = "sdhjgsdjsd";
        
      String  enc = encode(Text);
      
        System.out.println(enc);
        
        String  dnc = decode(Text);
      
        System.out.println(dnc);
    }
}
