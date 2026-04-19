
class SymmetricMatrix {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{2,4,5},{3,5,6}};
        boolean isSymmetric = true;

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i][j] != a[j][i]){
                    isSymmetric = false;
                }
            }
        }

        if(isSymmetric)
            System.out.println("Matrix is Symmetric");
        else
            System.out.println("Matrix is Not Symmetric");
    }
}
