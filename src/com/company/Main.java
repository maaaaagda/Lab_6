package com.company;

import java.util.Collections;

public class Main {

    public static void main(String[] args)
    {



        Studenci std = new Studenci();
        std.testBubbleSort();
        Student [] tab = new Student[7];
      //  Collections.sort(tab, Student.nameSurnameComparator);

      /*  Student s1 = new Student("Jan", "Kowalski", 228001, 4.0);
        Student s2 = new Student("Adam", "Adamiec", 228002, 3.0);
        Student s3 = new Student("Daniel", "Zawada", 228003, 2.0);
        Student s4 = new Student("Pawel", "Nowak", 228004, 4.5);
        Student s5 = new Student("Stefan", "Nowakowski", 228005, 2.8);

        Student[] studenci = {s1, s2, s3, s4, s5};
        testBubbleSort(studenci);
    }
    public static void testBubbleSort(Student [] studenci)
    {
        // wypełnienie listy
        //sortowanie wg nazwisk

        StudentSorter ls = new SelectSort(NameComparator.INSTANCE) {
            @Override
            public Object[] sort(Object[] objects) {
                return new Object[0];
            }
        };
        Student [] studenciPos = new Student[studenci.length];
        studenci = (Student[]) ls.sort(studenci);
        System.out.println(studenci);
        System.out.println();
        // wg punktów
     /*   ls=new BubbleSort(PointsComparator.INSTANCE);
        lista=ls.sort(lista);
        System.out.println(lista);
        System.out.println();
        //wg punktów i nazwisk (przy równych punktach decyduje nazwisko)
        Comparator cc=new CompoundComparator();
        cc.add(NameComparator.INSTANCE);
        cc.add(PointComparator.INSTANCE);

        ls=new BubbleSort(cc);
        lista=ls.sort(lista);
        System.out.println(lista);
        System.out.println();   */
    }
}
