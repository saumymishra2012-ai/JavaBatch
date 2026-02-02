class ABC 
{
    void output()
    {
        System.out.println(" this is a output method of ABC class ");
    }
}
class IJK
{
    void disp()
    {
         System.out.println(" this is a disp method of IJK class ");
    }
}
class Main 
{
    public static void main(String[]args)
    {
        ABC abc=new ABC();
        abc.output();
        IJK ijk = new IJK();
        ijk.disp();
    }
}