class Trib {
    public int tribonacci(int n) {
        if(n==0)
        {
            return 0;
        }
        else if(n==1 || n==2)
        {
            return 1;
        }
        else
        {
            int F=0;
            int S=1;
            int T=1;
            for(int i=1;i<=n;i++)
            {
                int Four=F+S+T;
                F=S;
                S=T;
                T=Four;
            }
            return F;
        }
    }
}