class Vodka extends Decoration {
    Vodka(Offering offering) {
        super(offering);
    }

    String getName() {
        return offering.getName() + " with Vodka";
    }

    int getPrice() {
        return offering.getPrice() + 65;
    }
}