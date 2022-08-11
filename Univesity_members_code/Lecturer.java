class Lecturer extends Person{
    String lecturerNum;
    int yearTeach;

    public Lecturer(){}

    public Lecturer(String name, String sur, int age, String type, String lecturerNum, int yearTeach){
        super(name, sur, age, type);
        this.lecturerNum = lecturerNum;
        this.yearTeach = yearTeach;
    }

    public String getLecNumber(){
        return lecturerNum;
    }

    
    public int getYearTeach(){
        return yearTeach;
    }

    public int compareTo(Person a){
        if(this.getClass().equals(a.getClass())){
            Lecturer ab = (Lecturer)a;
            if(this.getYearTeach() == ab.getYearTeach()){
                return 0;
            }else if(this.getYearTeach() > ab.getYearTeach()){ //stud1 and stud2 stud1.compareto(stud2)
                return 1;
            }else{
                return -1;
            }
        }else{
            return this.getClass().getName().compareTo(a.getClass().getName());
        }
    }

    public String toString(){
        return getName() + " " + getName() + " "+ getAge() + " "+ getType()+  " "+ getLecNumber()+ " " + getYearTeach();
    }

}