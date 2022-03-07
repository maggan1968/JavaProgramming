package day4_Practice_Unit2;

public class Unit_2_Assesment_ForLoopCont {

    public static void main(String[] args) {
        String resultContinue = "";
        String resultAfterContinue = "";
        for (int i = 0; i < 10; i++) {

            if (i % 2 == 0) {
                resultContinue += i + " ";
                continue;
            }else {
                resultAfterContinue += i + " ";
            }

        }
        System.out.println("resultContinue = " + resultContinue);
        System.out.println("resultAfterContinue = " + resultAfterContinue);
    }
}


