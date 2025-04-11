class Whiskey extends Decoration {
    Whiskey(Offering offering) {
        super(offering);
    }

    String getName() {
        return offering.getName() + " with Whiskey";
    }

    int getPrice() {
        return offering.getPrice() + 75;
    }
}