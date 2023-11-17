public class Main
{
    public static void main(String[] args)
    {
        Staff staffMember = new Staff();
        staffMember.initialize1();
        staffMember.print1();
        staffMember.initialize();
        staffMember.print();
        Person person = new Person();
        person.initialize();
        person.print();
    }
}