package practice06;

public class Teacher extends Person{
    private int klass;

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public int getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        return this.klass != 0? "My name is "+this.getName()+". I am "+this.getAge()+" years old. I am a Teacher. I teach Class "+this.klass +"." :"My name is "+this.getName()+". I am "+this.getAge()+" years old. I am a Teacher. I teach No Class." ;
    }
}
