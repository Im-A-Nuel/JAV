abstract class atribut{
    public String name = "Imanuel";
    public int nim = 71220927;
    public String major = "Informatics";

    public abstract void study();
}

class Student extends atribut{
    public int graduation = 2025;
    public void study(){
        System.out.println("Studying all day long");
    }
}


class New{
    public static void main(String[] args) {
        Student sd = new Student();
        System.out.println("Name\t: " + sd.name);
        System.out.println("Nim\t: " + sd.nim);
        System.out.println("Major\t: " + sd.major);
        System.out.println("Graduation: " + sd.graduation);

    }
}