import java.util.Scanner;
public class Anagram{
    public static void main(String  [] args){
        Scanner s = new  Scanner(System.in);
        String m = s.next();
        String m1 = s.next();
        int len = m.length();
        int len1 = m1.length();
        char [] a = m.toCharArray();
        char [] a1 = new char[len1];
        for(int i =0 ;i<len1;i++){
            char x = m1.charAt(i);
            a1[i] = x;
        }
        if(len == len1){
            int [] b = new int[123];
            for(int i =0;i<123;i++){
                b[i] = 0;
            }
            for(int i=0;i<len;i++){
                int w = (int)a[i];
                b[w]++;
            }
            char f [] = new char[len];
            int f1 = 0; 
            for(int i=0;i<123;i++){
                if(b[i]>0){
                    char x = (char)i;
                    f[f1] = x;
                    f1++;
                }
            }
            System.out.println();
            int b1[] = new int[123];
            for(int i=0;i<123;i++){
                b1[i] = 0;
            }
            for(int i=0;i<len1;i++){
                int w = (int)a1[i];
                b1[w]++;
            }
            char g[] = new char[len];int g1=0;
            for(int i=0;i<123;i++){
                if(b1[i]>0){
                    char x = (char)i;
                    g[g1] = x;
                    g1++;
                }
            }
            int count =0;
            for(int i=0;i<len;i++){
                if(f[i] != g[i]){
                    count++;
                    break;
                }
            }
            if(count == 0){
                System.out.println("anagram");
            }
            else{
                System.out.println("not Anagram");
            }
        }
        else{
            System.out.println("not Anagram");
        }
    }
}
