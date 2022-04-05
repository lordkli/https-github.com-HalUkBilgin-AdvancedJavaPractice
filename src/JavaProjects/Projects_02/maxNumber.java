package JavaProjects.Projects_02;

public class maxNumber {


      /*
        Create int 2D array

        Which is {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}

        print the max number from the 2d array

     */


     /*

         {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}

         int 2D arrayini  olustur

        2D arrayinden max number print et

     */


    public static void main(String[] args) {

        int[][] i1 = new int[][]{{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}};

        int max = 0 ;
        for( int i = 0 ; i < i1.length ; i++){
            for(int j =0 ; j< i1[i].length ; j++){

                if(i1[i][j] > max){
                    max = i1[i][j];
                }
            }

        }

        System.out.println(max);

    }

}
