class Student extends Person{
    private String studNum;

    public Student(){}

    public Student(String name, String surname, int age, String type, String std){
        super(name, surname, age, type);
        this.studNum = std;
    }

    public String getStudNumber(){
        return studNum;
    }

    public int compareTo(Person a){
        if(this.getClass().equals(a.getClass())){
            Student ab = (Student)a;
            if(this.getStudNumber() == ab.getStudNumber()){
                return 0;
            }else if(this.getAge() > ab.getAge()) //stud1 and stud2 stud1.compareto(stud2)
            {
                return 1;
            }else{
                return -1;
            }
        }else{
            return this.getClass().getName().compareTo(a.getClass().getName());
        }
    }

    public String toString(){
        return getName() + " " + getName() + " "+ getAge() + " "+ getType()+  " "+ getStudNumber();
    }
}