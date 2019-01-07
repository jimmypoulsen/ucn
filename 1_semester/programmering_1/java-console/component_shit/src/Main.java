public class Main {
    private static Product nail, hammer;
    private static Pack packOfNails, hammerPack;

    public static void main(String[] args) {
        nail = new Product("Nail", 100);
        hammer = new Product("Hammer", 200);
        packOfNails = new Pack("Pack of nails");
        packOfNails.addChild(nail, 100);

        hammerPack = new Pack("Hammer pack");
        hammerPack.addChild(hammer, 1);
        hammerPack.addChild(packOfNails, 1);

        nail.print();
        System.out.println("----");
        hammer.print();
        System.out.println("----");
        packOfNails.print();
        System.out.println("----");
        hammerPack.print();
    }
}
