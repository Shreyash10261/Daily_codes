class diagonal_Sum {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += mat[i][i];
            sum += mat[i][n - 1 - i];
        }

        if (n % 2 == 1) {
            sum -= mat[n / 2][n / 2];
        }

        return sum;
    }

    public static void main(String[] args) {
        diagonal_Sum obj = new diagonal_Sum();

        int[][] mat1 = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(obj.diagonalSum(mat1)); 

        int[][] mat2 = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        System.out.println(obj.diagonalSum(mat2)); 

        int[][] mat3 = {{5}};
        System.out.println(obj.diagonalSum(mat3)); 
    }
}