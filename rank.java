public class rank{
    public static int findrank(int [][] matrix){
        int rows=matrix.length;
        int cols=matrix[0].length;
        int rank=cols;
        for(int row=0;row<rank;row++){
            if(matrix[row][row] !=0){
                for(int col=0;col<rows;col++){
                    if(col!=rows){
                        double multiplier=(double) matrix[col][row]/matrix[row][row];
                        for(int i=0;i<rank;i++){
                            matrix[col][i]-=multiplier*matrix[row][i];

                        }

                    }
                }
            }else{
                boolean reduced=false;
                for(int i= row+1;i<rows;i++){
                    if (matrix[i][row]!=0){
                        int[] temp=matrix[row];
                        matrix[row]=matrix[i];
                        matrix[i]=temp ;
                        reduced=true;
                        break;}
                    }
                    if(!reduced){
                        rank--;
                        for(int i=0;i<rows;i++){
                            matrix[i][row]=matrix[i][rank];

                        }
                    }
                    row--;
                    }
                }
                return rank;
            }
            public static void main(String[] args) {
                int[][]matrix={
                    {1,0,0},
                    {0,1,0},
                    {0,0,1}
                };
                int rank=findrank(matrix);
                System.out.println(rank);
            }
        }

