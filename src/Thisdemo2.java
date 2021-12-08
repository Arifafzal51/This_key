class Thisdemo2
{
    Thisdemo2 m1()

    {
        return this;
    }

    public static void main(String[] args) {
        Thisdemo2 t= new Thisdemo2();
        t.m1();
    }
}