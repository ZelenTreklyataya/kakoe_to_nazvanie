import java.util.Scanner;
public class Main  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Phone phone1 = new Phone("Samsung",scan.nextLine(),scan.nextLine(),"Black",170,6.6f,167.5f,67.4f,8,128);
        Phone phone2 = new Phone("Iphone","77007898778","Gleb","Gold",174,6.1f,170.5f,68.5f,6,256);
        Phone phone3 = new Phone("Xiaomi","77052340000","Ivan","Silver",160,5.6f,150.6f,57.7f,4,64);
        Phone phone4 = new Phone("OPPO","77057678900","Oleg","Black",180,7f,180.5f,70.8f,8,512);
        Phone phone5 = new Phone("Xiaomi","77758885678","Daniel","Gold",165,6.1f,164.8f,62.6f,8,64);
        System.out.print(phone1.model);
        test(phone1.model);
        System.out.print(phone1.number);
        test(phone1.number);
        System.out.print(phone1.ownerName);
        test(phone1.ownerName);
        System.out.print(phone1.color);
        test(phone1.color);
        System.out.print(phone1.weight);
        test(phone1.weight);
        System.out.print(phone1.size);
        test(phone1.size);
        System.out.print(phone1.height);
        test(phone1.height);
        System.out.print(phone1.width);
        test(phone1.width);
        System.out.print(phone1.CPUcores);
        test(phone1.CPUcores);
        System.out.print(phone1.memory);
        test(phone1.memory);
        System.out.print(phone1.memory);
        test(phone1.memory);
        System.out.print(phone1.otherConfigs.numOfCamera);
        test(phone1.otherConfigs.numOfCamera);
        System.out.print(phone1.otherConfigs.colorCase);
        test(phone1.otherConfigs.colorCase);
        System.out.print(phone1.otherConfigs.scanner);
        test(phone1.otherConfigs.scanner);
        phone1.receiveCall();
        phone2.receiveCall();
        phone3.receiveCall();
        Empty newEmpty = new Empty();
    }
    public static class Phone {
        private String model;
        private String number;
        private String ownerName;
        private String color;
        private int weight;
        private float size;
        private float height;
        private float width;
        private int CPUcores;
        private int memory;

        OtherConfigs otherConfigs = new OtherConfigs(2, "Black", true);

        public Phone(String model, String number, String ownerName, String color, int weight, float size, float height, float width, int CPUcores, int memory) {
            this.model = model;
            this.number = number;
            this.ownerName = ownerName;
            this.color = color;
            this.weight = weight;
            this.size = size;
            this.height = height;
            this.width = width;
            this.CPUcores = CPUcores;
            this.memory = memory;

        }
        static class OtherConfigs{
            private int numOfCamera;
            private String colorCase;
            private boolean scanner;
            OtherConfigs(int numOfCamera, String colorCase, boolean scanner) {
                this.colorCase = colorCase;
                this.scanner = scanner;
                this.numOfCamera = numOfCamera;
            }
        }


        public void receiveCall() {
            System.out.println(getOwnerName());
            System.out.println(getNumber());
        }

        public String getOwnerName() {
            return ownerName;
        }

        public String getNumber() {
            return number;
        }

    }
    public static void test(Object value){
        if(value instanceof Integer){
            System.out.println(" Это Integer ");
        }
        else if(value instanceof String){
            System.out.println(" Это String ");
        }
        else if(value instanceof Float){
            System.out.println(" Это Float ");
        }
        else if(value instanceof Boolean){
            System.out.println(" Это Boolean ");
        }
    }
    public static class Empty{
        public Empty() {

        }
    }
}