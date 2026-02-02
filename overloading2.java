class Shape
{
    int Area(int l, int b)
    {
        return l * b ;
    }
    double Area(double r)
    {
        return r*r*3.14 ;
    }
    int Area(int s)
    {
        return s*s ;
    }
}
class overloading2
{
    public static void main(String []args)
    {
        Shape sr = new Shape();
        System.out.println("Result="+sr.Area(25));
    }
}