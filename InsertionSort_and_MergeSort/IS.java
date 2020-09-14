package IS; 

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner; 

class IS
{
	public List insertionSort(List<Integer> list) {
	    int i, j;
	    
	    Integer[] array = new Integer[list.size()];
    	
    	for(int k = 0; k < list.size(); k++) 
    		array[k] = list.get(k);
    	
	    for (i = 1; i < array.length; i++) {
	    	
	    	Integer tmp = array[i];
	    	
	        j =  Math.abs(Arrays.binarySearch(array, 0, i, tmp) + 1);
	        System.arraycopy(array, j, array, j+1, i-j);
	        array[j] = tmp;
	       
	        
	    }
	    list = Arrays.asList(array);
	    return list;
	}

    static void printList(List<Integer> list)
    {
        int n = list.size(); 

        for (int i=0; i<n; ++i) 

            System.out.print(list.get(i) + " "); 

        System.out.println();

    }
    public static void main(String args[]) throws FileNotFoundException 
    {        
    File file = new File("C:\\Users\\Administrator\\Desktop\\data02.txt");
    Scanner scanner = new Scanner(file);
    scanner.useDelimiter(",");
    List<Integer> list = new ArrayList<Integer>();
    
    while(scanner.hasNextInt()){
    	  list.add(scanner.nextInt());
    }
        IS ob = new IS();       
        
        

        printList(ob.insertionSort(list)    );
    }

}
//O(n*n)
