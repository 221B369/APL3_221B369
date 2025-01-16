public class LE0
{
    int age;
    String name;
    void SetAge(int age)
    {
        this.age = age;
    }
    int GetAge()
    {
        return age;
    }
    void SetName(String name)
    {
        this.name = name;
    }
    String GetName()
    {
        return name;
    }
    public static void main(String[] args) {
        Data ob = new Data();
        ob.name = "Shreya Gupta";
        ob.SetAge(21);
        System.out.println(ob.GetName());
        System.out.println(ob.GetAge());
    }
}