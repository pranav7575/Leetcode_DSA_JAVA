class L122O {

    public static void main(String args[]) {
        L122O l11 = new L122O();
        int arr[] = {1, 2, 3, 4, 5};
        int demo = l11.maxProfit(arr);
        System.out.println(demo);
    }

    public int maxProfit(int[] prices) {
     int profit=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]>prices[i-1])
            {
                profit+=prices[i]-prices[i-1];
            }
        }
 return profit;
}
}