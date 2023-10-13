public class Phone {

    public int numberPhone;
    public String modelPhone;
    public int weightPhone;
    public static String countryMadePhone;

    public Phone() {
    }
    public Phone(int numberPhone, String modelPhone, int weightPhone, String countryMadePhone) {
        this.numberPhone = numberPhone;
        this.modelPhone = modelPhone;
        this.weightPhone = weightPhone;
        Phone.countryMadePhone = countryMadePhone;
    }

}
