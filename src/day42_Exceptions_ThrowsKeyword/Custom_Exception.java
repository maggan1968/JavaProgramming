package day42_Exceptions_ThrowsKeyword;

//custom un check exception
class FadyException extends RuntimeException{

    public FadyException(){// default exception
        super("Time for a short break");
    }
    public FadyException(String message){
        super(message);
    }
}
class NoBreakException extends Exception{//custom checked exception

}



public class Custom_Exception {

    public static void main(String[] args) throws NoBreakException {

      //  throw new FadyException("Its time for lunch break");

       try {
           throw new NoBreakException();
       }catch (NoBreakException e){
           e.printStackTrace();
       }
    }
}
