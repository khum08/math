public class Vector2 implements IVector2 {

    double x;
    double y;

    public Vector2() {
    }

    public Vector2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public IVector2 add(IVector2 v) {
        x += v.x;
        y += v.y;
        return this;
    }

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

    public double dot(IVector2 v) {
        return x * v.x + y * v.y;
    }

    public double cross(IVector2 v) {
        return x * v.y - y * v.x;
    }

    public double length() {
        return Math.hypot(x, y);
    }

    public IVector2 rotate(double rad) {
        x = x * Math.cos(rad) - y * Math.sin(rad);
        y = x * Math.sin(rad) + y * Math.cos(rad);
        return this;
    }
}
