public class Phone {
    public String namePhone;
    public int numberPhone;
    public String modelPhone;
    public int weightPhone;
    public static String countryMadePhone;

    public Phone() {
    }
    public Phone(String namePhone, int numberPhone, String modelPhone, int weightPhone, String countryMadePhone) {
        this.namePhone = namePhone;
        this.numberPhone = numberPhone;
        this.modelPhone = modelPhone;
        this.weightPhone = weightPhone;
        Phone.countryMadePhone = countryMadePhone;
    }
    public void receiveCall(String namePhone) {
        System.out.println("Звонит абонент по имени " + namePhone);
    }
    public void receiveCall(String namePhone, int numberPhone) {
        System.out.println("Звонит абонент по имени " + namePhone + " номер " + numberPhone);
    }

}
