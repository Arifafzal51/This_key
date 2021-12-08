public class Thisdemo
{
    Thisdemo()
    {
        this(44);
        System.out.println("No arg counstroctor");
    }
    Thisdemo(int a)
    {
        //this();
        System.out.println("parametrized counstructor");
    }

    public static void main(String[] args) {
        Thisdemo td=new Thisdemo();
       // td.display();
       // td.show();
    }


}
