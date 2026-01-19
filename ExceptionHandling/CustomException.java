package ExceptionHandling;

public class CustomException extends Exception{
    private double degree;
    public CustomException(double degree){
        this.degree=degree;
    }
    @Override
    public String getMessage(){
        return "The temperature "+degree+"C isn't in the normal range";
    }

    public double getDegree(){
        return degree;
    }

}
