class Two extends One {
    Two(int x) {
        super(x);
    }

    public static void main(String[] args) {
        Two obj = new Two(10);
        System.out.println("Value of x: " + obj.x);
    }
}
