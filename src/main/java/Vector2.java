public class Vector2 implements IVector2 {

    double x;
    double y;

    public Vector2() {
    }

    public Vector2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * vector addition.
     * @param v to be added
     * @return this(allow to chaining)
     */
    public IVector2 add(IVector2 v) {
        x += v.x;
        y += v.y;
        return this;
    }

    /**
     * vector subtraction.
     * @param v to be subst.
     * @return this
     */
    public IVector2 sub(IVector2 v) {
        x -= v.x;
        y -= v.y;

        return this;
    }

    public IVector2 scale(double scalar) {
        x *= scalar;
        y *= scalar;

        return this;
    }

    /**
     * vector dot production.
     * @param v another vector.
     * @return this.
     */
    public double dot(IVector2 v) {
        return x * v.x + y * v.y;
    }

    /**
     * vector cross production.
     * @param v another vector.
     * @return
     */
    public double cross(IVector2 v) {
        return x * v.y - y * v.x;
    }

    /**
     * the length of the vector.
     * @return length.
     */
    public double length() {
        return Math.hypot(x, y);
    }

    /**
     * rotate this vector around plane.
     * @param rad rotate angle.
     * @return rotated vector.
     */
    public IVector2 rotate(double rad) {
        x = x * Math.cos(rad) - y * Math.sin(rad);
        y = x * Math.sin(rad) + y * Math.cos(rad);
        return this;
    }
}
