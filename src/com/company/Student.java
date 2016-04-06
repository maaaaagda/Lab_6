package com.company;
import java.util.Comparator;

/**
 * Created by Magdalena Polak on 05.04.2016.
 */
/**
 * Created by Magdalena Polak on 05.04.2016.
 */
public class Student implements Comparable<Student>
{
    String name;
    String surname;
    int nr;
    double average;
    public Student( String name, String surname, int nr, double average)
    {
        this.name = name;
        this.surname = surname;
        this.nr = nr;
        this.average = average;
    }
    public int porNazw(Student s) { return surname.compareTo(s.surname);}

    public int porSrednia(Student s) { return  (int)average - (int)s.average;}
    public int porNr(Student s) { return nr - s.nr;}

    public int compareTo(Student o) {
        int porownaneNazwiska = surname.compareTo(o.surname);

        if(porownaneNazwiska == 0) {
            return name.compareTo(o.name);
        }
        else {
            return porownaneNazwiska;
        }
    };
    public int compare (Student o1, Student o2)
    {
        int porownaneNazwiska = o1.name.compareTo(o2.name);

        if(porownaneNazwiska == 0) {
            return o1.surname.compareTo(o2.surname);
        }
        else {
            return porownaneNazwiska;
        }
    };


    public String toString()
    {
        return surname +" "+ name+ " " + nr+ " " + average;
    }
}
