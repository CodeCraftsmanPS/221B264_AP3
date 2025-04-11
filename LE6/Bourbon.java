class Bourbon extends Decoration {
    Bourbon(Offering offering) {
        super(offering);
    }

    String getName() {
        return offering.getName() + " with Bourbon";
    }

    int getPrice() {
        return offering.getPrice() + 50;
    }
}