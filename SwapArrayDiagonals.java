/** Program to swap diagonals of n*n array **/
import java.io.*;  
class SwapArrayDiagonals { 
    public static int n = 5;
    /*Method to interchange diagonals  of array*/
    static void swapDiagonals(char array[][]) { 
   	 // swap elements of diagonal
    	 for (int i = 0; i < n;++i) {
           	if (i != n / 2)
		{ 
		  char temp = array[i][i];
               	  array[i][i] = array[i][n - i -1];                
                  array[i][n - i - 1] = temp; 
                }
           }
	   // Printing the Array after diagonals swapped 
           for (int i = 0; i < n; ++i) 
           { 
           	for (int j = 0; j < n; ++j) 
               		System.out.print(array[i][j]+" "); 
            		System.out.println(); 
       	   } 
    } 
    public static void main (String[] args)  
    { 
        char array[][] = {{'A', 'B', 'C', 'D','E'}, 
                        {'F', 'G', 'H', 'I', 'J'}, 
                        {'K', 'L', 'M', 'N', 'O'},
                        {'P', 'Q', 'R', 'S', 'T'},
                        {'U', 'V', 'W', 'X', 'Y'}
                        }; 
        swapDiagonals(array); 
    } 
} 