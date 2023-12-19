class Student {
    String firstName;
    String lastName;
    String group;
    double averageMark;
    Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }
    Student() {
        this.firstName="unknown ";

    }
    //Methods
    public void getScholarship(String firstName){
        if (averageMark >= 5){
            System.out.println(firstName+"100$");
        }
        else {
            System.out.println(firstName+"80$");
        }
    }
    public void getScholarship(){
        if (averageMark >= 5){
            System.out.println(firstName+"100$");
        }
        else {
            System.out.println(firstName+"80$");
        }
    }

}
class Aspirant extends Student{
    String researchTopic;

    Aspirant(String firstName, String lastName, String group, double averageMark, String researchTopic) {
        super(firstName, lastName, group, averageMark);
        this.researchTopic = researchTopic;
    }
    Aspirant() {

    }
    public void getScholarship(String firstName){
        if (averageMark >= 5 ){
            System.out.println(firstName+"200$");
        }
        else {
            System.out.println(firstName+"180$");
        }
    }

}
class Main1{
    public static void main(String[] args){

        Student obj1=new Student();
        Student obj2=new Aspirant("Person1 ","LastName1","Group-1",94,"Software");
        Aspirant obj3=new Aspirant("Almas ","Khusainov","SE-2335",78.3,"Viciles");


        System.out.println(obj2.firstName + " " + obj2.lastName + " " + obj2.group + " " + obj2.averageMark + " ");
        System.out.println(obj3.firstName + " " + obj3.lastName + " " + obj3.group + " " + obj3.averageMark + " " + obj3.researchTopic);

        Student[] students={obj2,obj3};
        for(Student s :students){
            s.getScholarship();
        }
        obj1.getScholarship(obj1.firstName);
        obj2.getScholarship(obj2.firstName);
        obj3.getScholarship(obj3.firstName);



    }


}

