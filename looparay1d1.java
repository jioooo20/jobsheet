package jobsheet;

public class looparay1d1 {
    public static void main(String[] args) {
        
        String[] alpha = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O"};
        int simpanIndex=0;

        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print(alpha[simpanIndex]);
                simpanIndex++;
            }
            System.out.println();
        }

    }
}
