package jobsheet;

public class looparay1d3 {
    public static void main(String[] args) {
        
        String[] alpha = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O"};
        int simpanIndex=0;

        for(int i=0;i<5;i++){
            for(int j=0;j<3;j++){
                System.out.print(alpha[simpanIndex]);
                simpanIndex +=5;
                if(simpanIndex>=15){
                    simpanIndex = i+1;
                }
            }
            System.out.println();
        }

    }
}
