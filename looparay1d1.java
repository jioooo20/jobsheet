package jobsheet;

public class looparay1d1 {
    public static void main(String[] args) {
        
        String[] alpha = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O"};

        for(int i=0;i<15;i++){
            for(int j=0;j<(i+1);j++){
                System.out.print(alpha[j]);
            }
            System.out.println();
        }

    }
}
