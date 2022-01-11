package day5_Practice_Unit2;

public class ByteArray {

    public static void main(String[] args) {

        byte [] b = new byte[5];

        for (int j = 0; j < b.length; j++) {
            b[j] = (byte)(b[j]*2);
        }

        System.out.println(b);

    }



}
