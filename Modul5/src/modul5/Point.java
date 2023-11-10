package modul5;

/**
 *
 * @author Rolan Firmansyah
 */
public interface Point {

    double getX();
    double getY();
    void setCartesian(double x, double y);
    double getR();
    double getTheta();
    void setPolar(double r, double theta);
}
