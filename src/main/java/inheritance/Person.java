package inheritance;

public class Person {
    private String name;
    private int age;
    private String gender;

//    public Person() {
//        System.out.println("In Person Default constructor");
//    }

    public Person(String name) {
        this.name = name;
        System.out.println("In Person second constructor");
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
