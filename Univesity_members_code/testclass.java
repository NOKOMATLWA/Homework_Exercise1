public class testclass{
    public static void main(String args[]){
        //primitive data types int double float
        //wrapper class object Integer, Double, String
        MyArrayList<Student> students = new MyArrayList<>();

        Student stud1 = new Student("sean","typeo",18,"Student", "28654147");
        Student stud2 =new Student("rex","typeo",20,"Student", "29654147");
        Student stud3 = new Student("typs","typeo",24,"Student", "32654147");
        Student stud4 = new Student("reis","typeo",17,"Student", "45654147");
        Student stud5 = new Student("reis","typeo",20,"Student", "27654147"); 
        
        students.add(0,stud1);
        students.add(1,stud2);
        students.add(2,stud3);
        students.add(3,stud4);
        students.add(4,stud5);
        System.out.println("Students before the sort list");
        for(int a = 0; a < students.size(); a++){
            System.out.println(students.get(a).toString());
        }


        students.sortList();
        System.out.println("Students after the sort list");
        for(int a = 0; a < students.size(); a++){
            System.out.println(students.get(a).toString());
        }

        //lecturer
        MyArrayList<Lecturer> lecturers = new MyArrayList<>();

        Lecturer lect1 = new Lecturer("sean","typeo",18,"Lecturer", "28654147",1);
        Lecturer lect2 =new Lecturer("rex","typeo",20,"Lecturer", "29654147",2);
        Lecturer lect3 = new Lecturer("typs","typeo",24,"Lecturer", "32654147",3);
        Lecturer lect4 = new Lecturer("reis","typeo",17,"Lecturer", "45654147",1);
        Lecturer lect5 = new Lecturer("reis","typeo",20,"Lecturer", "27654147",2); 
        
        lecturers.add(0,lect1);
        lecturers.add(1,lect2);
        lecturers.add(2,lect3);
        lecturers.add(3,lect4);
        lecturers.add(4,lect5);
        System.out.println("lecturers before the sort list");
        for(int a = 0; a < lecturers.size(); a++){
            System.out.println(lecturers.get(a).toString());
        }


        lecturers.sortList();
        System.out.println("lecturers after the sort list");
        for(int a = 0; a < lecturers.size(); a++){
            System.out.println(lecturers.get(a).toString());
        }


    }
}