import java.util.Scanner;

public class ShowByteBits {
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        byte bv = sc.nextByte();
        System.out.printf("%d" , (bv & 0x80) >> 7);
        System.out.printf("%d" , (bv & 64) >> 6);
        System.out.printf("%d" , (bv & 32) >> 5);
        System.out.printf("%d" , (bv & 16) >> 4);
        System.out.printf("%d" , (bv & 8) >> 3);
        System.out.printf("%d" , (bv & 4) >> 2);
        System.out.printf("%d" , (bv & 2) >> 1);
        System.out.printf("%d\n" , (bv & 0x01));
    }
}
