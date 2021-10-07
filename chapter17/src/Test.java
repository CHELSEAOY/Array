import java.util.Objects;


//String对象比较的时候必须使用equals方法
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student(15,"SUM");
        System.out.println(s1);
        Student s2 = new Student(15,"SUM");
        System.out.println(s1.equals(s2));
    }
}

class Student{
    //学号
    int no;  //基本数据类型，比较时使用“==”
    //所在学校
    String school; //引用数据类型，比较时使用：equals方法

    public Student() {
    }

    public Student(int no, String school) {
        this.no = no;
        this.school = school;
    }


    //重写toString方法
    @Override
    public String toString() {
        return  "学号：" + no + ",学校" + school;
    }

/*    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return no == student.no &&
                Objects.equals(school, student.school);
    }*/

    //重写equals方法
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Student)) return false;
        if(this == obj) return true;
        Student s = (Student)obj;
        return this.no == s.no && this.school.equals(s.school);

    }

}


