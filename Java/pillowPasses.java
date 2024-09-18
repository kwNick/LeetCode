class pillowPasses {
    public int passThePillow(int n, int time) {
        int rotate = time / (n - 1);
        int passes = time % (n - 1);
        if (rotate % 2 == 0)
            return passes + 1;
        else
            return n - passes;
    }

    public int passThePillow_2(int n, int time) {
        int modd = time % (n - 1);
        if ((time / (n - 1)) % 2 == 1) {
            return n - modd;
        }
        return modd + 1;
    }
}