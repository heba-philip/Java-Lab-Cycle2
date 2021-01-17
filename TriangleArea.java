import java.io.*;
public class TriangleArea {
    TriangleArea()
    {
        System.out.println(perimeter(3, 4, 5));
        System.out.println(area(3, 4, 5));
    }

    int perimeter(int x,int y , int z)
    {
        return (x + y + z);
    }

    int area(int x, int y, int z)
    {
        return (int) (0.5 * 3 * 4);
    }
    public static void main(String[] args) {
        TriangleArea obj = new TriangleArea();
    }
}