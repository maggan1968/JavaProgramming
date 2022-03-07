package day7_Practice_accessModifier_Constructor_CustomClass_RemainderRule_Statics.statics;

import java.util.ArrayList;
import java.util.Arrays;

public class StaticBlock {

    public static int num;
    public static ArrayList<String> carModels;

    static {

        num=10;
        carModels=new ArrayList<>();
        carModels.addAll(Arrays.asList("Toyota","BMW","Ford","Honda"));


    }

    public StaticBlock(){
        System.out.println("no org");
        num += 5;
    }

    public StaticBlock(int value){
        System.out.println("One param constructor");
        num += value;
    }
}
