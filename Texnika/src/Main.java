
public class Main {

    public static void main(String... args) {

        Smartphone deviceSmartphone = new Smartphone();

        deviceSmartphone.name = "Samsung";
        deviceSmartphone.count = 1;
        deviceSmartphone.screensize = 7;
        deviceSmartphone.turnOn();

        System.out.println(deviceSmartphone.count + " " + deviceSmartphone.name + " " + deviceSmartphone.screensize + "`");

        deviceSmartphone.smartphone();


        TV deviceTv = new TV();

        deviceTv.name = "Toshiba";
        deviceTv.count = 2;
        deviceTv.screensize = 42;
        deviceTv.turnOn();

        System.out.println(deviceTv.count + " " + deviceTv.name + " " + deviceTv.screensize + "`");

        deviceTv.tv();


        Notebook deviceNotebook = new Notebook();

        deviceNotebook.name = "Sony";
        deviceNotebook.count = 1;
        deviceNotebook.screensize = 17;
        deviceNotebook.turnOn();

        System.out.println(deviceNotebook.count + " " + deviceNotebook.name + " " + deviceNotebook.screensize + "`");

        deviceNotebook.notebook();

    }
}
