class L122 {

    public static void main(String args[]) {
        L122 l11 = new L122();
        int arr[] = {1, 2, 3, 4, 5};
        int demo = l11.maxProfit(arr);
        System.out.println(demo);
    }

    public int maxProfit(int[] prices) {
        boolean buy = true;
        int get = 0;
        int sum = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            // check local minima for the first value
            if (buy && i == 0) {
                if (prices[i] <= prices[i + 1]) {
                    buy = false;
                    get = prices[0];
                }
            } else if (buy && prices.length > 2) {
                if (prices[i] <= prices[i - 1] && prices[i] <= prices[i + 1]) {
                    buy = false;
                    get = prices[i];
                }
            }

            if (!buy && i > 0) {
                if (prices[i] >= prices[i - 1] && prices[i] >= prices[i + 1] && i < prices.length - 1) {
                    sum += prices[i] - get;
                    buy = true;
                } else if (i == prices.length - 2) {
                    sum += prices[i + 1] - get;
                }
            } else if (!buy && prices.length <= 2) {
                sum += prices[i + 1] - get;
            }
        }

        return sum;
    }
}
