import javax.swing.*;

/**
 * Name> Yahor Siarheyeu
 * M.Nr.> 11930943
 */
public class ExceptionChecker {

    public boolean checkTriangle(double A, double B, double C) throws IllegalArgumentException{
        return !(A + B < C) && !(B + C < A) && !(C + A < B);
    }

    public boolean checkNumber(String strNum) throws NullPointerException, IllegalArgumentException{
        try{
            double d = Double.parseDouble(strNum);
            if(d <= 0){
                return false;
            }
        } catch (NumberFormatException | NullPointerException nfe){
            return false;
        }
        return true;


    }
}
