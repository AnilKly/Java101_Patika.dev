class Product {
    protected int id;
    protected String name;
    protected double price;

    public Product() {
    }
    // 3 sınıf oluşturuldu

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

class Phone extends Product {
    protected String phoneNumber;

   // noArgsConstructor
    public Phone() {
    }
    // allargsConsructor
    public Phone(int id, String name, double price, String phoneNumber) {
        super(id, name, price);
        this.phoneNumber = phoneNumber;
    }
}

class SmartPhone extends Phone {
    protected int storage;
    protected int ram;
    protected int camera;

    public SmartPhone() {
    }

    public SmartPhone(int id, String name, double price, String phoneNumber,
                      int storage, int ram, int camera) {
        super(id, name, price, phoneNumber);
        this.storage = storage;
        this.ram = ram;
        this.camera = camera;
    }
}
// smartPhone dizisi
public class PhoneApp {
    public static void main(String[] args) {

        SmartPhone[] smartPhoneArray = {
                new SmartPhone(1, "Phone A", 3000, "111111", 128, 4, 16),
                new SmartPhone(2, "Phone B", 5000, "22222", 256, 6, 20),
                new SmartPhone(3, "Phone C", 6000, "33333", 512, 8, 24),
                new SmartPhone(4, "Phone D", 7000, "44444", 256, 8, 32),
                new SmartPhone(5, "Phone E", 8000, "55555", 512, 12, 48)
        };

        // toplam fiyatı hesaplama ve yazdırma
        double totalPrice = 0.0;
        for (SmartPhone phone : smartPhoneArray) {
            totalPrice += phone.price;
        }
        System.out.println( "Total price of SmartPhones:" + totalPrice + " TL");
    }
}
