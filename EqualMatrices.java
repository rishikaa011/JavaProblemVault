
class EqualMatrices {
    public static void main(String[] args) {
        int[][] a = {{1,2},{3,4}};
        int[][] b = {{1,2},{3,4}};
        boolean isEqual = true;

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                if(a[i][j] != b[i][j]){
                    isEqual = false;
                }
            }
        }

        if(isEqual)
            System.out.println("Matrices are Equal");
        else
            System.out.println("Matrices are Not Equal");
    }
}
