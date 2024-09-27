*****
*****
*****
*****
*****
public class Patterns {
    public static void main(String args[]){
    pattern1(5);
    }
static void pattern1(int n){
    for(int row = 0; row <= n; row++){
        for(int cols = 0;  cols <= n; cols++){
         System.out.print("*");
        } System.out.println();
}
}
}

*
**
***
****
*****
******

public class Patterns {
    public static void main(String args[]){
    pattern2(5);
    }
static void pattern2(int n){
    for(int row = 0; row <= n; row++){
        for(int cols = 0;  cols <= row; cols++){
         System.out.print("*");
        } System.out.println();
}
}
}
  
******
*****
****
***
**
*

public class Patterns {
    public static void main(String args[]){
    pattern3(5);
    }
static void pattern3(int n){
    for(int row = 0; row <= n; row++){
        for(int cols = n;  cols >= row; cols--){
         System.out.print("*");
        } System.out.println();
}
}
}

1
12
123
1234
12345

public class Patterns {
    public static void main(String args[]){
    pattern4(5);
    }
static void pattern4(int n){
    for(int row = 0; row <= n; row++){
        for(int cols = 1;  cols <= row; cols++){
         System.out.print(cols);
        } System.out.println();
}
}
}
