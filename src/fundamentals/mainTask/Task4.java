package fundamentals.mainTask;

public class Task4 {
    public static void main(String[] args) {
        int sum = 0;
        int com = 1;
        for (String arg : args) {
            int num = Integer.parseInt(arg);
            sum += num;
            com *= num;
        }
        System.out.println(sum);
        System.out.println(com);
    }
}
