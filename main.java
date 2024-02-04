
class student{
    public String name;
    private int nim;
    private String major;

    student(String name, int nim, String major){
        this.name = name;
        this.nim = nim;
        this.major = major;
    }

    public String Getname(){
        return name;
    }
    public int Getnim(){
        return nim;
    }
    public String Getmajor(){
        return major;
    }
    public void Setname(String new_name){
        this.name = new_name;
    }


}


class Main{
    public static void main(String[] args) {
        student sd1 = new student("Imanuel", 71220927, "Infomatics");
        System.out.println("hello my name is "+sd1.Getname() + " with nim " + sd1.Getnim() + " from major "+ sd1.Getmajor());
        sd1.Setname("dede");
        System.out.println("hello my name is "+sd1.Getname() + " with nim " + sd1.Getnim() + " from major "+ sd1.Getmajor());
    }
}
  