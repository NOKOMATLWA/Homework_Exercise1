public abstract class Person implements Comparable<Person>{
    private String name;
    private String surname;
    private int age;
    private String type;

    public Person(){}
    public Person(String name, String surname, int age, String type){
        this.name = name;
        this.surname = surname;
        this.type = type;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }

    public int getAge(){
        return age;
    }

    public String getType(){
        return type;
    }

    
}