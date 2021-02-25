public class MathUtils {

    static final double EPSILON = 1e-8;

    /**
     * radian transform to degree.
     * @param rad radian value
     * @return degree value
     */
    public double rad2deg(double rad) {
        return rad * 180 / Math.PI;
    }

    /**
     * degree transform to radian.
     * @param deg degree value.
     * @return radian value.
     */
    public double deg2rad(double deg) {
        return deg * Math.PI / 180;
    }

    /**
     * clamp the x to be between min and max.
     * @param x value to be clamped.
     * @param min minimum.
     * @param max maximum.
     * @return result.
     */
    public double clamp(double x, double min, double max) {
        return Math.max(min, Math.min(x, max));
    }
}
