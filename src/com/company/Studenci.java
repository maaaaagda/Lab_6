package com.company;

/**
 * Created by Magdalena Polak on 05.04.2016.
 */
public class Studenci {
  //  Student[] studenci = new Student[5];

    public Studenci() {
    }

    public void testBubbleSort() {
        // wypełnienie listy
        Student s1 = new Student("Jan", "Kowalski", 228001, 4.0);
        Student s2 = new Student("Adam", "Adamiec", 228002, 3.0);
        Student s3 = new Student("Daniel", "Zawada", 228003, 2.0);
        Student s4 = new Student("Pawel", "Nowak", 228004, 4.5);
        Student s5 = new Student("Stefan", "Nowako", 228005, 2.8);

        Object[] studenci = {s1, s2, s3, s4, s5};
        int l = studenci.length;
        //sortowanie wg nazwisk

        StudentSorter ls = new SelectSort(NameComparator.INSTANCE) {};
        StudentSorter ls1 = new MergeSort(NameComparator.INSTANCE) {};
        //Student[] studenciPosSelest = new Student[studenci.length];
        studenci =  ls.sort(studenci);
        System.out.println("Posortowani studenci wg SelectedSort\n");
       for(int i = 0; i< l; i++)
        {
            System.out.printf("%-15s",((Student)studenci[i]).surname);
            System.out.printf("%-10s", ((Student)studenci[i]).name);
            System.out.printf("%10d",  ((Student)studenci[i]).nr);
            System.out.printf("%10.2f", ((Student)studenci[i]).average);
            System.out.println();
        }
        studenci = ls1.sort(studenci);
        System.out.println("Posortowani studenci wg MergeSort\n");
        for(int i = 0; i< l; i++)
        {
            System.out.printf("%-15s",((Student)studenci[i]).surname);
            System.out.printf("%-10s", ((Student)studenci[i]).name);
            System.out.printf("%10d",  ((Student)studenci[i]).nr);
            System.out.printf("%10.2f", ((Student)studenci[i]).average);
            System.out.println();
        }
        CompoundComparator cc = new CompoundComparator();

        cc.addComparator(NameComparator.INSTANCE);
        cc.addComparator(NaturalComparator.INSTANCE);
        Comparator kk = cc;
        ls=new SelectSort(kk);
        studenci=ls.sort(studenci);
        System.out.println(studenci);
        System.out.println();



    }
}
