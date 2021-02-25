public interface IVector2 {
    double x = 0;
    double y = 0;

    IVector2 add(IVector2 v);
    IVector2 sub(IVector2 v);
    IVector2 scale(double scalar);

    double dot(IVector2 v);
    double cross(IVector2 v);

    double length();

    IVector2 rotate(double rad);


}
