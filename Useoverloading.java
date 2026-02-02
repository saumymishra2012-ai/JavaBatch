class mathmatic
{
    int addvalue(int a, int b)
    {
        return a + b ;
    }
    double addvalue(double a, double b)
    {
        return a + b ;
    }
    String addvalue(String a, String b)
    {
        return a + b ;
    }
}
class Useoverloading
{
    public static void main(String []args)
    {
        mathmatic obj = new mathmatic();
        System.out.println("Result="+obj.addvalue(10,23.25));
    }
}