    public static int maxChocolates(int money, int price, int wrap) {
        int chocolates = money / price;
        int wrappers = chocolates;

        while (wrappers >= wrap) {
            int free = wrappers / wrap;
            chocolates += free;
            wrappers = wrappers % wrap + free;
        }

        return chocolates;
    }
    void main() {
        int money = 15;
        int price = 1;
        int wrap = 3;

        System.out.println("Максимум шоколадок: " + maxChocolates(money, price, wrap));

        // Можно проверить и на других данных
        System.out.println(maxChocolates(10, 2, 2));
        System.out.println(maxChocolates(20, 5, 4));
    }