class myemployee
{
    private int id;
    private String name;
    int getid()
    {
        return id;
    }
    int setid(int n)
    {
        return id = n;
    }
    String getname()
    {
        return name;
    }
    String setname(String n)
    {
        return name  = n;
    }
}
public class Getter_and_setter {
    public static void main(String[] args) {
        myemployee setting = new myemployee();
        setting.setid(456);
        System.out.println(setting.getid());
        setting.setname("Subham Kumar padhy");
        System.out.println(setting.getname());
    }
}
