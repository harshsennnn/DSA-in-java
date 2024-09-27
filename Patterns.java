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
  