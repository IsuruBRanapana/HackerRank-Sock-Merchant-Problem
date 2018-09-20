
package hackerranksockmerchant;
import java.util.Scanner;
public class HackerRankSockMerchant {

    public static void main(String[] args) {
        
        int position,d,temp,i,n;
        Scanner in=new Scanner(System.in);
        int ar[]=new int[10000];
        n=in.nextInt();
        for(i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        //sorting the color pile using selection sorting method
                for(i=0;i<n;i++){
            position=i;
            for(d=position+1;d<n;d++){
                if(ar[position]>ar[d]){
                    position=d;
                }
            }
            if(position!=i){
                temp=ar[position];
                ar[position]=ar[i];
                ar[i]=temp;
            }
        }
        //checking and finalizing
        int result=0;
        for(i=0;i<n;i++){
            if(ar[i]==ar[i+1]){
                result++;
                i=i+1;
            }
        }
        System.out.print(result);

    }
    
}
