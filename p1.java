public class Problem1
{
    static int l = 1000;
    public static void main(String[] args)
    {
        int z[] = {l-(l%3),l-(l%5),l-(l%15)};
        int t[] = {z[0] == l?l-3:z[0],z[1] == l?l-5:z[1],z[2] == l?l-15:z[2]};
        int f[] ={(t[0]-3)/3 +1,(t[1]-5)/5 +1,(t[2]-15)/15 +1};
        int s[] ={f[0]/2*(3+t[0]),f[1]/2*(5+t[1]),f[2]/2*(15+t[2])};
        System.out.println(s[0]+s[1]-s[2]);
    }
    public static void main2(String[] args)
    {
        int s =0;
        for(int i=3;i<l;i++)
        {
            if (i%3== 0 ||  i%5==0)s+=i;
        }
        System.out.println(s);
    }
}
