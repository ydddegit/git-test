/***
 * @title TestString
 * @description
 * @author yan.dongdong
 * @create 2024/12/26 14:59
 */

public class TestString {
    public static void main(String[] args) {
        String ut = "1085";
        byte[] bytes = ut.getBytes();
        for (byte aByte : bytes) {
            System.out.println(aByte);
        }
    }
}
