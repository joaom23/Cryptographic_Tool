/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhoPratico;

/**
 *
 * @author jmfer
 */
public class Utils {
    public static void printByArray(String s, byte[] array){
        
        StringBuilder sb = new StringBuilder();
        for(byte b : array){
            sb.append(String.format("%02x", b));
        }
        
        System.out.println(s + sb.toString());
        System.out.println("Tamanho:" + array.length * 8 + " bits");
    }
    
    public static String ByteArrayToString(byte[] array) {

        StringBuilder sb = new StringBuilder();
        for (byte b : array) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
    
    public static String removeExtension(String fileName) {
        if (fileName.indexOf(".") > 0) {
            return fileName.substring(0, fileName.lastIndexOf("."));
        } else {
            return fileName;
        }
}
}
