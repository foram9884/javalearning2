package DoWhileloop;

public class MultiplicationTable {
    public static void main(String[] args) {
        int i=1;
        int n=12;
        System.out.println("Table of 12: ");

        do
        {
            System.out.println(n+" * "+i+" = "+ (n*i));
            i++;
        }
        while(i<=10);
    }
}


