class logical {
    public static void main(String args[])
    {
        int i = 10;
        int j = 14;
        
        float l = 10f;
        int r = (int)l;
        double k = 10.5;

       boolean res1 = (i > j) || (l < k);
       boolean res2 = (i < k ) && (i<=r);
       boolean res3 = (i != l) || (r>=i);

       System.out.println(res1);
        System.out.println(res2);
        System.out.println(!res3);
    }
}