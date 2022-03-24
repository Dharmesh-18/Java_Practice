public class J12_Multi_DIm_Array {

    public static void main(String[] args) {


//        Basic way to create a 2_d array
//        int[][] flats = new int [2][3];

//        Simple way to create a 2_d array
        int [] [] flats = {{101, 102, 103, 104}, {201, 202, 203}};

//        Basic way to display a 2_d array
        for(int i = 0; i< flats.length; i++){
            for (int j = 0; j<flats[i].length; j++){
                System.out.print(flats[i][j]+ "\t\t");
            }
            System.out.println("");
        }

//        better way to display a 2_d array
        for(int[] flat : flats){
            for(int i : flat){
                System.out.print(i+ "\t\t");
            }
            System.out.println("");
        }

    }
}
