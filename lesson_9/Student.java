package lesson_9;

public class Student {
    private String name;
    private String lastName;
    private Integer teacherId;
    private Integer average;

  
    Student(String name, String lastName, Integer average, Integer teacherId) {
        this.name = name;
        this.lastName = lastName;
        this.average = average;
        this.teacherId = teacherId;
    }

    public String toString() {
        return String.format("\nid преподавателя:%d\nИмя:%s\nФамилия:%s\nСредний бал:%d\n", teacherId, name, lastName,
        average);
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAverage() {
        return average;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

}
