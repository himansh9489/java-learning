package src.basic;
class Student {
    String name;
    Integer age;

    // non-parameterized  constructor
    Student() {
        this.name = "";
        this.age = 0;
    }
    // parameterized constructor
     Student(String name, Integer age, Integer rollNo) {
        this.name = name;
        this.age = age;
    }
    // copy constructor
    Student(Student student){
        this.name = student.name;
        this.age = student.age;
    }

    /* not need to write destructor bcz java has efficient garbage collector*/

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    /* same getInfo function but has different parameter type (String/Int)
       or different number of parameter (one/two) both are example of
       function overloading (compile time polymorphism)
     */
    public void getInfo (String name) {
        System.out.println("name = "+name);
    }
    public void getInfo (int age) {
        System.out.println("age = "+age);
    }
    public void getInfo (String name,int age) {
        System.out.println("name = "+name);
        System.out.println("age = "+age);
    }
    public void getInfo () {
        System.out.println("name = "+this.name);
        System.out.println("age = "+this.age);
    }
};