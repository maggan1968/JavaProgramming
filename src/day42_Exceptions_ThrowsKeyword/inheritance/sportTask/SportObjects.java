package day42_Exceptions_ThrowsKeyword.inheritance.sportTask;

public class SportObjects {
    public static void main(String[] args) {

        Basketball basketball = new Basketball();
        basketball.setInfo("NBA", 9, 13,"yes");
        basketball.play();
        basketball.crossover();
        basketball.wraparound();
        basketball.dribble();
        System.out.println("basketball = " + basketball);

        Baseball baseball= new Baseball();
        baseball.setInfo("Fly Guys", 9,7,"yes");
        baseball.play();
        baseball.batter();

        System.out.println(baseball);

        Football football = new Football();
        football.setInfo("Galatasaray", 11, 3,"yes");
        football.play();
        football.offSide();

        System.out.println(football);

    }


}
