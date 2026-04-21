import java.util.*;

public class Pattern2{

    // Hollow Rectangle Pattern
    // * * * * * 
    // *       * 
    // *       * 
    // * * * * * 


    public static void hollow_rectangle(int totRows, int totCols){
        // Outer loop
        for(int i=1; i<=totRows; i++){
            // inner - columns
            for(int j=1; j<=totCols; j++){
                // Cell - (i, j)
                if(i == 1 || i == totRows || j == 1 || j == totCols){
                    // boundary cell
                    System.out.print("* ");
                }else{
                    System.out.print("  "); 
                }
            }
            System.out.println();
        }
    }


    // Inverted & Rotated half Pyramid;
    //    *
    //   **
    //  ***
    // ****



    public static void inverted_rotated_half_pyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    // Inverted HAlf-Pyramid with number.
    // 1 2 3 4 5
    // 1 2 3 4
    // 1 2 3
    // 1 2
    // 1


    public static void inverted_half_pyramid(int n){
        for(int i=1; i<=n; i++){

            // inner - numbers.
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    // Floyd's Triangle Pattern.
    // 1 
    // 2 3 
    // 4 5 6 
    // 7 8 9 10 
    // 11 12 13 14 15 

    public static void floyd_triangle(int n){
        int counter = 1;
        //outer
        for(int i=1; i<=n; i++){
            // inner - how many timeswill counter a printed.
            for(int j=1; j<=i; j++){
                System.out.print(counter+ " ");
                counter++;
            }
            System.out.println();
        }
    }

    // 0-1 Triangle Pattern.
    // 1
    // 01
    // 101
    // 0101
    // 10101

    public static void zero_one(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i + j) % 2 == 0){
                    System.out.print('1');
                }else{
                    System.out.print('0');
                }
            }
            System.out.println();
        }
    }


    // Butterfly Triangle Pattern.
    // *      *
    // **    **
    // ***  ***
    // ********
    // ********
    // ***  ***
    // **    **
    // *      *

    public static void Butterfly(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    // Solid  RHOMBUS.

    //     *****
    //    *****
    //   *****
    //  *****
    // *****

    public static void solid_rhombus(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }


    // Hollow Rhombus.
    //       * * * * 
    //     *     * 
    //    *     * 
    //   * * * * 


    public static void hollow_rhombus(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            for(int j=1; j<=n; j++){
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("* ");
                }else{
                    System.out.print("  "); 
                }
            }
            System.out.println();
        }
    }

    // Print Diamond Pattern

    public static void diamond(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }

    public static void main(String arg[]){
        // hollow_rectangle(4, 5);
        // inverted_rotated_half_pyramid(4);
        // inverted_half_pyramid(5);
        // floyd_triangle(5);
        // zero_one(5);
        // Butterfly(4);
        // solid_rhombus(5);
        // hollow_rhombus(4);
        diamond(4);
    }
}
