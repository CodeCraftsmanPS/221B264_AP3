/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

// Define the Application class to test the method overriding
class Application {
    public static void main(String[] args) {
        // Create an instance of Mother
        Mother m = new Mother();
        m.show(); // Call the show method of Mother

        // Create an instance of Child
        Child ch = new Child();
        ch.show(); // Call the overridden show method of Child
        
        Mother m1 = new Child();
        m1.show();
    }
}
