import static java.lang.Integer.max;

/**
 *
 * @author dorgelesw
 */
public class Stripe_Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] A = {2};
        System.out.println("stripe problem solution is: "+Stripe_Solution.stripe_problem_solve(A));
    }
    
    
    public static int stripe_problem_solve (int [] A){
        int size = A.length;
        int j = 0, i, t, k=0;
    
        for (i = 0; i<size; i=i+1){
            if (A[i]<=0){
                t = A[i];
                A[i]=A[j];
                A[j]=t;
                j +=1;
            }
        }
        int sizeC = size-j;
        int[] cache = new int[sizeC];
        
        for(i=j; i<size; i=i+1){
            cache[k]=A[i];
            k++;
        }
        
        for(i=0; i<sizeC; i=i+1){
             if(Math.abs(cache[i]) - 1 < sizeC && cache[Math.abs(cache[i]) - 1] > 0)
                cache[Math.abs(cache[i]) - 1] = -cache[Math.abs(cache[i]) - 1];
        }
        
        for(i=0; i<sizeC; i=i+1){
            if(cache[i]>0)
                return i+1;
        }
        return sizeC+1;
    }
       
}
