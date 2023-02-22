

public class Kombinasyon {
    int a=0;
    int[][] memo= new int[30][30];
    public int nCr(int n, int r) {
        int data=0;
        if (r == 0 || r == n) return 1;
        if(memo[n][r]!=0){
            return memo[n][r];
        }else{
            data=nCr(n-1, r-1) + nCr(n-1, r);
            memo[n][r]=data;
        }
        return data;
    }
}
