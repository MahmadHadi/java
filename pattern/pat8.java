class pat8 {
    public static void main(String[] a) 
    {
        for (int i = 1; i < 5; i++) 
        {
            for (int j = 5; j > i; j--) 
            {
                System.out.print("  "); 
            }
            System.out.print("* "); 
            for (int k = 2; k <= i; k++) 
            {
                System.out.print("  ");
            }
            for (int l = 3; l <= i; l++) 
            {
                System.out.print("  ");
            }
            if (i > 1) System.out.println("* ");
            else System.out.println("  ");
        }
        for (int i = 5; i >= 1; i--) 
        {
            for (int j = 5; j > i; j--) 
            {
                System.out.print("  "); 
            }
            System.out.print("*"); 
            for (int k = 2; k <= i; k++) 
            {
                System.out.print("  ");
            }
            for (int l = 3; l <= i; l++) 
            {
                System.out.print("  ");
            }
            if (i > 1) System.out.println("* ");
            else System.out.println("  ");
        }
    }
}
