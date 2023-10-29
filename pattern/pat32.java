class pat32
{
    public static void main(String[] args)
    {
        int i=5;
        int j[][]=new int[i][i];
        int k=1;
        int l=0,m=i-1;
        int n=0,o=i-1;
        while(l<=m && n<=o)
        {
            for(int p=0;p<i;p++) //1 2 3 4 5
            {
                j[l][p]=k;
                k++;
            }
            l++;
            for(int q=1;q<i;q++)//6 7 8 9
            {
                j[q][o]=k;
                k++;
            }
            o--;
            k=6;
            for(int r=3;r>=0;r--)//6 7 8 9
            {
                j[m][r]=k;
                k++;
            }
            m--;
            for(int s=3;s>0;s--)//10 11 12
            {
                j[s][n]=k;
                k++;
            }
            n++;
            for(int t=1;t<4;t++)//13 14 15
            {
                j[l][t]=k;
                k++;
            }
            l++;
            for(int u=2;u<4;u++)//16 15
            {
                j[u][o]=k;
                k--;
            }
            o--;
            k+=2;
            for(int v=2;v>0;v--)//16 15
            {
                j[m][v]=k;
                k--;
            }
            m--;
            k+=2;
            for(int w=2;w>1;w--)//16
            {
                j[w][n]=k;
                k++;
            }
            n++;
            for(int x=2;x<3;x++)//17
            {
                j[l][x]=k;
                k++;
            }
            l++;
        }
        for(int w=0;w<i;w++)
            {
                for(int x=0;x<i;x++)
                    System.out.print(j[w][x]+" ");
                System.out.println("");
            }
    }
}
