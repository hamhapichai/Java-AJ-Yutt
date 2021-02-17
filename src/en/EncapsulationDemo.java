package en;
public class EncapsulationDemo {
    static private String idcard="123456789";
    static public int age=25;
    static protected double salary=25000.00;
    public static void setidcard(String id){
        idcard = id;
    }
    public static String getidcard(){
        return idcard;
    }
}

class RunEncap {
    static String idcard="xxxxxxxxxx";
    public static void main(String[] args) {
        EncapsulationDemo obj1 = new EncapsulationDemo();
        System.out.println(idcard);
        System.out.println(obj1.getidcard());
        obj1.setidcard("654564654");
        System.out.println(obj1.getidcard());
        System.out.println(obj1.age);
        System.out.println(obj1.salary);
    }
}
