package ObjectInheritanceConstructor;
public class ObjectPerson {
	private String name;
    private int age;
    public ObjectPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public static void main(String[] args) {
        ObjectPerson person = new ObjectPerson("John Doe", 30);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
