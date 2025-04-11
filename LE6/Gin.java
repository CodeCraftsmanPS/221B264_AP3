class Gin extends Decoration {
    Gin(Offering offering) {
        super(offering);
    }

    String getName() {
        return offering.getName() + " with Gin";
    }

    int getPrice() {
        return offering.getPrice() + 70;
    }
}