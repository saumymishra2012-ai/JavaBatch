class XYZ
{
    void Ram()
    {
        System.out.println(" this is a Ram method of XYZ class ");
    }
}
class STU
{
    void Param()
    {
         System.out.println(" this is a Param method of STU class ");
    }
}
class PQR
{
    void Rat()
    {
         System.out.println(" this is a Rat method of PQR class ");
    }
}
class Maintype
{
    public static void main(String[]args)
    {
        XYZ xyz=new XYZ();
        xyz.Ram();
        STU stu = new STU();
        stu.Param();
        PQR pqr = new PQR();
        pqr.Rat();
    }
}