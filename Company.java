class Employee
{
    int id ;
    String name ;
    String post ;
    int salary;
    Employee()
    {
        id=9999;
        name="Elon Musk";
        post="CEO";
        salary=99999;
    }
    Employee(int id , String name , String post , int salary)
    {
        this.id = id ;
        this.name = name;
        this.post = post;
        this.salary = salary
    }
    Employee(Employee emp)
    {
        id = emp.id ;
        name = emp.name;
        post = emp.post;
        salary = emp.salary  ; 
    }
    void disp()
    {
        System.out.println("ID="+id);   
        System.out.println("NAME="+name);  
        System.out.println("POST="+post);   
        System.out.println("SALARY="+salary);   
    }
}
class Main
{
    public static void main (String args[])
    {
        Employee e1=new Employee();
        e1.disp();
        Employee e2=new Employee(id:10000009 , name:"Putin", post:"CEO", salary:90003 );
        e2.disp();
        Employee e3=new Employee(e2);
        e3.disp(); 
    }
}