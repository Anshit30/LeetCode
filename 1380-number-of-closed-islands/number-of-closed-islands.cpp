class Solution {
    void dfs(int row, int col, vector<vector<int>>&grid){
           grid[row][col] = 1;
           int m = grid.size();
           int n = grid[0].size();
           int delRow[] = {-1, 0, 1, 0};
           int delCol[] = {0, 1, 0, -1};

           for(int i=0;i<4;i++){
            int nrow = row + delRow[i];
            int ncol = col + delCol[i];

            if(nrow >= 0 && nrow < m && ncol >=0 && ncol < n && grid[nrow][ncol] == 0){
                dfs(nrow, ncol, grid);
            }
        }
    }
public:
    int closedIsland(vector<vector<int>>& grid) {
        int m = grid.size();
        int n = grid[0].size();

        for(int i=0;i<m;i++){
            if(grid[i][0] == 0){
                dfs(i, 0, grid);
            }
            if(grid[i][n-1] == 0){
                dfs(i, n-1, grid);
            }
        }
        for(int i=0;i<n;i++){
            if(grid[0][i] == 0){
                dfs(0, i, grid);
            }
            if(grid[m-1][i] == 0){
                dfs(m-1, i, grid);
            }
        }
        int count = 0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 0){
                    dfs(i, j, grid);
                    count++;
                }
            }
        }
        return count;
    }
};