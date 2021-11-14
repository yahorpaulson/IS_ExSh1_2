import javax.swing.*;

/**
 * Name> Yahor Siarheyeu
 * M.Nr.> 11930943
 */
public class ExceptionChecker {

    public boolean check(double A, double B, double C) throws IllegalArgumentException{
        if (A + B < C || B + C < A || C + A < B) {
            return false;
        }
        return true;
    }
}
