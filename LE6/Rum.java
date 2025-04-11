class Rum extends Decoration {
    Rum(Offering offering) {
        super(offering);
    }

    String getName() {
        return offering.getName() + " with Rum";
    }

    int getPrice() {
        return offering.getPrice() + 60;
    }
}