package day7_Practice_accessModifier_Constructor_CustomClass_RemainderRule_Statics.statics;

public class StaticBlockObject {

    public static void main(String[] args) {

        StaticBlock sb = new StaticBlock();
        System.out.println(sb.num);

        StaticBlock sb1 = new StaticBlock(40);
        System.out.println(sb1.num);

    }
}
