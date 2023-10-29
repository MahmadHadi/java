class pat31
{
    public static void main(String[] args)
    {
        int i = 5;
        int j[][] = new int[i][i];
        int k = 1;
        int l = 0, m = i - 1;
        int n = 0, o = i - 1;
        while (l <= m && n <= o)
        {
            for (int p = 0; p < i; p++)
            {
                j[l][p] = k;
                k++;
            }
            l++;
            for (int p = 1; p < i; p++)
            {
                j[p][o] = k;
                k++;
            }
            o--;
            for (int p = 3; p >= 0; p--)
            {
                j[m][p] = k;
                k++;
            }
            m--;
            for (int p = 3; p > 0; p--)
            {
                j[p][n] = k;
                k++;
            }
            n++;
            for (int p = 1; p < 4; p++)
            {
                j[l][p] = k;
                k++;
            }
            l++;
            for (int p = 2; p < 4; p++)
            {
                j[p][o] = k;
                k++;
            }
            o--;
            for (int p = 2; p > 0; p--)
            {
                j[m][p] = k;
                k++;
            }
            m--;
            for (int p = 2; p > 1; p--)
            {
                j[p][n] = k;
                k++;
            }
            n++;
            for (int p = 2; p < 3; p++)
            {
                j[l][p] = k;
                k++;
            }
            l++;
        }
        
        for (int x = 0; x < i; x++)
        {
            for (int y = 0; y < i; y++)
            {
                System.out.print(j[x][y] + " ");
            }
            System.out.println("");
        }
    }
}
