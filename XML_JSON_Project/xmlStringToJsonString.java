
package converter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        String input= s.nextLine();
        String s2="";
        if(input.charAt(0)=='{'){
            int i=2;
            while(i<input.length()&&input.charAt(i)!='\"'){
                s2=s2+input.charAt(i);
                i++;
            }
            i=i+2;
            String s3="";
            if(input.charAt(i)=='\"'){
                i++;
            }
            while(i<input.length()&&input.charAt(i)!='\"' && input.charAt(i)!=' '&&input.charAt(i)!='}'){
                s3=s3+input.charAt(i);
                i++;
            }
            String ans="";
            if(!s3.equals("null"))
                ans ="<"+s2+">"+s3+"</"+s2+">";
            else
                ans ="<"+s2+"/>";
            System.out.println(ans);
        }
        else if(input.charAt(0)=='<'){
            int j=1;
            String s4="";
            while(j<input.length()&&input.charAt(j) != '>' && input.charAt(j) != '/'){
                s4=s4+input.charAt(j);
                j++;
            }
            j=j+1;
            String s3="";
            if(j<=input.length()){
                while(j<input.length()&&input.charAt(j)!='<'&&input.charAt(j)!='>'){
                    s3=s3+input.charAt(j);
                    j++;
                }
            }
            String ans="";
            if(s3!=""){
                ans="{\""+s4+"\":"+"\""+s3+"\"}";
            }else ans ="{\""+s4+"\":"+"null"+"}";
            System.out.print(ans);
        }

    }
}
