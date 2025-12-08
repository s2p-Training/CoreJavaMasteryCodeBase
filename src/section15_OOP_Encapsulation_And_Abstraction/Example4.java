package section15_OOP_Encapsulation_And_Abstraction;

class Student
{
    int roll;
    String name;
    String courseName;
    int[] marks = new int[3];

    int totalMarks()
    {
//        int sum = marks[0] + marks[1] + marks[2];
        int sum = 0;

        for (int mark : marks) {
            sum = sum + mark;
        }

        return sum;
    }

    float average()
    {
        int sumOfAllSubjects = totalMarks();
        int numberOfSubjects = marks.length;
        float avg = (float) sumOfAllSubjects / numberOfSubjects;
        return avg;
    }

    void grade()
    {
        float avg = average();
        if(avg >= 90)
        {
            System.out.println("Grade A");
        }
        else if(avg >= 80)
        {
            System.out.println("Grade B");
        }
        else if(avg >= 70)
        {
            System.out.println("Grade C");
        }
        else
        {
            System.out.println("Grade D");
        }
    }

}

public class Example4
{
    public static void main(String[] args)
    {
        Student s1 = null;
        System.out.println(s1); // null

        s1 = new Student();
        System.out.println(s1);

        System.out.println("Name : " + s1.name);
        System.out.println("Course : " + s1.courseName);
        System.out.println("Roll : " + s1.roll);
        System.out.println("Marks : " + s1.marks[0]);
        System.out.println("Marks : " + s1.marks[1]);
        System.out.println("Marks : " + s1.marks[2]);

        s1.name = new String("Pranay Ramteke");  // Heap String
        s1.courseName = "C/C++ Backend Development";  // Literal String
        s1.roll = 1212;
        s1.marks[0] = 90;
        s1.marks[1] = 80;
        s1.marks[2] = 70;

        System.out.println("Name : " + s1.name);
        System.out.println("Course : " + s1.courseName);
        System.out.println("Roll : " + s1.roll);
        System.out.println("Marks : " + s1.marks[0]);
        System.out.println("Marks : " + s1.marks[1]);
        System.out.println("Marks : " + s1.marks[2]);

        s1.grade();

    }
}

