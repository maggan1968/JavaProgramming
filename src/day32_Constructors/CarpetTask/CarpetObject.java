package day32_Constructors.CarpetTask;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObject {
    public static void main(String[] args) {

        Carpet carpets1 = new Carpet(3, 5, 8, true);
        Carpet carpets2 = new Carpet(5, 8, 19, false);

        System.out.println(carpets1);
        System.out.println(carpets2);

    }
}

