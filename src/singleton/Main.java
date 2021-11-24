package singleton;

public class Main {
    public static void main(String[] args) {

        Singelton obx1 = new Singelton();

        System.out.println("obx1: "+obx1.nombre());

        Singelton obx2 = new Singelton();

        System.out.println("obx2: "+obx2.nombre());
    }
}
