class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Set<Integer> set=new LinkedHashSet<>();
        Set<Integer> dup=new LinkedHashSet<>();

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
              if(set.add(grid[i][j])){
                dup.add(grid[i][j]))
              }
            }
        }
        List<Integer> list=new ArrayList<>(dup);
       for(int i=1;i<set.length)
        
    }
}