class Main {
    public static void main(String[] args) {
        Offering offering = new Coffee(); // Start with Coffee
        offering = new Tea(); // Override with Tea
        offering = new IceCream(); // Override with Ice Cream
        offering = new Rum(offering); // Add Rum
        offering = new Gin(offering); // Add Gin
        offering = new Vodka(offering); // Add Vodka
        offering = new Whiskey(offering); // Add Whiskey
        offering = new Bourbon(offering); // Add Bourbon
        System.out.println(offering.getName() + " " + offering.getPrice());
    }
}