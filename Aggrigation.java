import java.util.ArrayList;
import java.util.List;

class College{

    private String name;
    List<Teacher> teacher;

    College(String name,List<Teacher> teacher){
        this.teacher = teacher;
        this.name = name;
    }
    public List<Teacher> getTeachers(){
        return teacher;
    }
}



class Teacher{
 
    private String name;
    private String subject;
    public Teacher(String name,String subject){

        this.name = name;
        this.subject = subject;
    }
    /*public String toString(){
        return "[name : "+name+",subject : "+subject+"]";
    }*/
}


public class Aggrigation{

    public static void main(String[] args) {
        Teacher t = new Teacher("vijay", "java");
        Teacher t1 = new Teacher("Raju", "python");
        Teacher t2 = new Teacher("Shiva", "java script");
        System.out.println(t);
        System.out.println(t1);
        System.out.println(t2);
        List<Teacher> teacher = new ArrayList<Teacher>();
        teacher.add(t);
        teacher.add(t1);
        teacher.add(t2);

        College c = new College("MVSR", teacher);
        System.out.println(c.getTeachers());

    }

}