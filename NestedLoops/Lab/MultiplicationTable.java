package BasicCourse.NestedLoops.Lab;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int x = 1; x <= 10 ; x++) {
            for (int y = 1; y <= 10; y++) {
                int Multi = x*y;
                System.out.printf("%d * %d = %d%n",x,y,Multi);

            }

        }
    }
}