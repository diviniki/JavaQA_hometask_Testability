public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.price(price); // должно получиться 500
        System.out.println(miles);

        //int myBonus = service.price(10000);
        //System.out.println(myBonus);
    }
}
