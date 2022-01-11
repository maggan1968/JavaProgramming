package day09_IfStatement;

public class GradeReport {
    public static void main(String[] args) {
        int score = 78; // 0 ~ 100

        boolean a = score >= 90 && score <= 100; // false
        //            false          true

        //boolean b = score >= 80 && !a; if score is A, but score is greater than 80
        boolean b = score >= 80 && score <= 89; // true

        boolean c = score >= 70 && score <= 79; // false
        //boolean c = !a && !b && score <= 79;

        boolean d = score >= 60 && score <= 69; // false

        boolean f = score >= 0 && score <= 59; // false
        //boolean f = !a && !b && !c && !d;

        if(a) {
            score = 90;
        }else if(b){
            score = 80;
        }else if(c) {
            score = 70;
        }else if(d){
            score = 60;
        }else{
            score = 0;
        }
        System.out.println(score);

    }

}
