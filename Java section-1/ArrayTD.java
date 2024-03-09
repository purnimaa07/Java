public class ArrayTD {
    
    public static void main(String[] args) {
        int[][] marks = {{72,78,88,92},{82,65,90,93},{56,63,98,75}};

        for(int i=0;i<marks.length;i++){
            switch(i){
                case 1:System.out.println("Harry: "); break;
                case 2:System.out.println("\nCarry: "); break;
                case 3:System.out.println("\nRomie: "); break;
            }
            for(int j=0;j<marks[i].length;j++){
                System.out.println(marks[i][j] + " ");
            }
            System.out.println("\n");

        }

        /*int[][] marks = new int[3][4];
        //Harry
        marks[0][0] = 72;
        marks[0][1] = 78;
        marks[0][2] = 88;
        marks[0][3] = 92;
        //Carrie
        marks[1][0] = 82;
        marks[1][1] = 65;
        marks[1][2] = 90;
        marks[1][3] = 93;
        //Romie
        marks[2][0] = 56;
        marks[2][1] = 63;
        marks[2][2] = 98;
        marks[2][3] = 75;
        

        System.out.println("\t Harry:" + Arrays.toString(marks[0]));
        System.out.println("\t Carrie:" + Arrays.toString(marks[1]));
        System.out.println("\t Romie:" + Arrays.toString(marks[2]));
        */

    }
}
