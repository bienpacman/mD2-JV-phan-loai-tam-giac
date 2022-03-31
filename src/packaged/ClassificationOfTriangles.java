package packaged;

public class ClassificationOfTriangles {

    public static final String TYPE_EQUILATERAL = "equilateral";
    public static final String TYPE_ISOSCELES = "isosceles";
    public static final String NOT_A_TRIANGLE = "NotATriangle";
   public static final String TYPE_NORMAL = "normal";

    public static String classify(int a, int b, int c) {
        if (a == b && b == c)
            return TYPE_EQUILATERAL;
        else if (a == b) {
            return TYPE_ISOSCELES;
        } else if (a + b >c && a + c > b && b + c > a ) {
            return TYPE_NORMAL;
        } else if(a + b < c) {
          return  NOT_A_TRIANGLE;
        }
        return null;
    }

}
