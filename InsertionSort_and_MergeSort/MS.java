
package IS;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MS 
{ 
    void merge(List<Integer> list, int l, int m, int r) 
    { 

        int n1 = m - l + 1;  
        int n2 = r - m;  
        int L[] = new int [n1];  
        int R[] = new int [n2]; 
        for (int i=0; i<n1; ++i) 
            L[i] = list.get(l + i);  
        for (int j=0; j<n2; ++j)  
            R[j] = list.get(m + 1+ j);  
        int i = 0, j = 0; 
        int k = l;  
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
            	list.set(k, L[i]);
                i++; 
            } 
            else
            {  
            	list.set(k, R[j]);
                 j++; 
             } 
            k++; 
        } 
        while (i < n1) 
        {  
        	list.set(k, L[i]);
            i++; 
            k++; 
        } 
        while (j < n2) 
         { 
        	list.set(k, R[j]);
            j++; 
            k++; 
        } 
    } 
    void sort(List<Integer> list, int l, int r) 
    { 
        if (l < r) 
        { 
            int m = (l+r)/2; 
            sort(list, l, m); 
            sort(list , m+1, r); 
            merge(list, l, m, r); 
        } 
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
            MS ob = new MS();       
            ob.sort(list,0,list.size()-1);    
            printList(list);
     }
} 
//ºò¼¼Å¸  nLogn 
//T(n) = 2T(n/2) + ºò¼¼Å¸(n)

 

 

 

 

 

 

 

 

