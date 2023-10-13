public class Main {
    public static void main(String[] args) {
        Phone sumsung = new Phone("Алексей", 123, "sumsung", 130, "Китай");
        Phone iphone = new Phone("Сергей", 456, "iphone", 120, "Китай");
        Phone xiaomi = new Phone("Валера", 789, "xiaomi", 125, "Китай");

        sumsung.receiveCall(iphone.namePhone);
        iphone.receiveCall(xiaomi.namePhone, xiaomi.numberPhone);
        xiaomi.receiveCall(sumsung.namePhone);

    }
}