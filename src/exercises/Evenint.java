package exercises;

public class Evenint {
    public static void main(String[] args) {
        int n[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int i : n) {
            if (i % 2 == 0){
                sum += i;
            }
        }
        System.out.println(sum);

    }
}
