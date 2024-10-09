
import java.util.*;
class RailFenceCipher {
    public static void encrypt(String s, int depth)
    {
        int l=s.length();
        String res="";
        char a[][]=new char[depth][l];
        for(int i=0;i<depth;i++)
        {
            for(int j=0;j<l;j++)
            {
                a[i][j]='\n';
            }
        }
        int r=0,c=0;
        boolean down=false;
        for(int i=0;i<l;i++)
        {
            if(r==0 || r==depth-1)
                down=!down;
            a[r][c++]=s.charAt(i);
            if(down)
                r++;
            else
                r--;
        }
        for(int i=0;i<depth;i++)
        {
            for(int j=0;j<l;j++)
            {
                if(a[i][j]!='\n')
                    res+=a[i][j];
            }
        }
        System.out.println("Encrypted text using Rail Fence Cipher technique is : "+res);
        
    }
    public static void decrypt(String s,int depth)
    {
        int l=s.length();
        char a[][]=new char[depth][l];
        int r=0,c=0;
        String res="";
        for(int i=0;i<depth;i++)
        {
            for(int j=0;j<l;j++)
                a[i][j]='\n';
        }
        boolean down=true;
        for(int i=0;i<l;i++)
        {
            
                if(r==0)
                    down=true;
                if(r==depth-1)
                    down=false;
                a[r][c++]='!';
                if(down)
                    r++;
                else
                    r--;
            
        }
        int k=0;
        for(int i=0;i<depth;i++)
        {
            for(int j=0;j<l;j++)
            {
                if(a[i][j]=='!' && k<l)
                    a[i][j]=s.charAt(k++);
            }
        }
        r=0;c=0;
        
        for(int i=0;i<l;i++)
        {
            
                if(r==0)
                    down=true;
                if(r==depth-1)
                    down=false;
                if(a[r][c]!='!')
                    res+=a[r][c++];
                if(down)
                    r++;
                else
                    r--;
            
        }
        System.out.println("Decrypted text using Rail Fence Technique: "+res);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter \n 1 To encrypt the text \n 2 to decrypt the text");
        int ch=sc.nextInt();
        sc.nextLine();
        if(ch==1)
        {
            System.out.println("Enter the plain text to encrypt");
            String s=sc.nextLine().toUpperCase().replaceAll("[^A-Z]","");
            System.out.println("Enter the depth to be used to encrypt");
            int d=sc.nextInt();
            encrypt(s,d);
        }
        else if(ch==2)
        {
            System.out.println("Enter the cipher text to decrypt");
            String s=sc.nextLine().toUpperCase().replaceAll("[^A-Z]","");
            System.out.println("Enter the depth to be used to decrypt");
            int d=sc.nextInt();
            decrypt(s,d);
        }
        else
            System.out.println("Oops! Wrong choice");
    }
}
