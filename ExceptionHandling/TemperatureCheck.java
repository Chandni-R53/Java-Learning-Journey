package ExceptionHandling;

public class TemperatureCheck {

    public static void checkTemperature(double degree) throws CustomException {

        if (degree < 0 || degree > 45) {
            throw new CustomException(degree);
        } else {
            System.out.println("Temperature is normal: " + degree + "C");
        }
    }

    public static void main(String[] args) {

        try {
            checkTemperature(67.8);   
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Program continues normally...");
        }
    }
}

