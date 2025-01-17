package practice07;

public class Teacher extends Person{
    private Klass klass;

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        return this.klass!=null? "My name is "+this.getName()+". I am "+this.getAge()+" years old. I am a Teacher. I teach "+this.klass.getDisplayName()+"." :"My name is "+this.getName()+". I am "+this.getAge()+" years old. I am a Teacher. I teach No Class." ;
    }

    public String introduceWith(Student student) {

        if (student.getKlass().getNumber() == this.klass.getNumber()) {
            return "My name is "+this.getName()+". I am "+this.getAge()+" years old. I am a Teacher. I teach "+student.getName()+".";
        } else {
            return "My name is "+this.getName()+". I am "+this.getAge()+" years old. I am a Teacher. I don't teach "+student.getName()+".";
        }
    }
}
