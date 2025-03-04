class Application {
    public static void main(String[] args) {
        One one = new One(10);
        System.out.println("Value in One: " + one.x);
        Two two = new Two(20);
        System.out.println("Value in Two: " + two.x);
    }
}