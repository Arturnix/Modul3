public class Student implements Comparable<Student> {
    private final int age;
    private final double height;
    private final String name;
    private final String lastName;

    public Student(int age, double height, String name, String lastName) {
        this.age = age;
        this.height = height;
        this.name = name;
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public int compareTo(Student otherStudent)
    {
        if (this.lastName.compareTo(otherStudent.getLastName()) != 0) {
            return this.lastName.compareTo(otherStudent.getLastName());
        }
        else {
            return  Integer.compare(getAge(), otherStudent.getAge());
        }
    }
}
