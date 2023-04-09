class Main {
  public static void main(String[] args) {
    
    // declare variables
    int a = 12, b = 5;

    // addition operator
    System.out.println("a + b = " + (a + b));

    // subtraction operator
    System.out.println("a - b = " + (a - b));

    // multiplication operator
    System.out.println("a * b = " + (a * b));

    // division operator
    System.out.println("a / b = " + (a / b));

    // modulo operator
    System.out.println("a % b = " + (a % b));

    int x = 4;
    int var;
    var = x;
    System.out.println("var using =: " + var);

    var += x;
    System.out.println("var using +=: " + var);

    var *= x;
    System.out.println("var using *=: " + var);
    
    int l = 7, m = 11;

    System.out.println("a is " + l + " and b is " + m);

    System.out.println(" l == m "+(l == m));  // false


    System.out.println(l != m);  // true


    System.out.println(l > m);  // false

    System.out.println(l < m);  // true


    System.out.println(l >= m);  // false

    System.out.println(l <= m);  // true

    System.out.println((5 > 3) && (8 > 5));  // true

    // || operator

    System.out.println((5 < 3) || (8 < 5));  // false

    // ! operator
    System.out.println(!(5 == 3));  // true

    int z = 5;
    z++;
    System.out.println(" after incrementing a : "+(z));
    z--;
    System.out.println(" after decrementing a : "+(z));

    int k=5;
    k<<;
    System.out.println(" after left shift of k : "+k);
  }

}