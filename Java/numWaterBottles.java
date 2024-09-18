class numWaterBottles {
    public int num_Water_Bottles(int numBottles, int numExchange) {
        int total = numBottles;
        while (numBottles >= numExchange) {
            total += numBottles / numExchange;
            numBottles = (numBottles / numExchange) + (numBottles % numExchange);
        }
        return total;
    }
}