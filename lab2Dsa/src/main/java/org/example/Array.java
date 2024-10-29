package org.example;


public class Array {
    private String[] students;
    private int count;

    public Array(int size){
        students= new String[size];
    }

    public void addStudent(String student){
        if(students.length==count){
            String[] newStudents= new String[count * 2];
            for(int i=0; i<count;i++){
                newStudents[i]=students[i];
            }
            students=newStudents;
        }
        students[count]=student;
        count++;
    }

    public String findStudentByIndex(int studentIndex){
        if(studentIndex<0 || studentIndex > count){
            throw new IllegalArgumentException();
        }
        return students[studentIndex];
    }

    public void removeStudent(int studentIndex){
        if(studentIndex<0 || studentIndex > count){
            throw new IllegalArgumentException();
        }
        for(int i=studentIndex; i<count;i++){
            students[i]=students[i+1];
        }
        count--;

    }


    public void listStudentsNames(){
       for(int i=0; i<count;i++){
           System.out.println(students[i]);
       }
    }
}
