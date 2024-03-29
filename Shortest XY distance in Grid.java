class Solution {
    static int shortestXYDist(ArrayList<ArrayList<Character>> grid, int N,
                              int M) {
        // code here
     // List to store the positions of X's
    List<Point> xList = new ArrayList<>();
    // List to store the positions of Y's
    List<Point> yList = new ArrayList<>();

    // Iterate through the 2D grid and populate the xList and yList
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < M; j++) {
            char c = grid.get(i).get(j);
            if (c == 'X') {
                xList.add(new Point(i, j)); // Add the position of the X to xList
            } else if (c == 'Y') {
                yList.add(new Point(i, j)); // Add the position of the Y to yList
            }
        }
    }

    int minDist = Integer.MAX_VALUE; // minimum Manhattan distance found so far
    // Iterate through each point in xList and yList
    for (Point x : xList) {
        for (Point y : yList) {
            // Calculate Manhattan distance between x and y
            int dist = Math.abs(x.row - y.row) + Math.abs(x.col - y.col);
            // Update the minimum distance if necessary
            if (dist < minDist) {
                minDist = dist;
            }
        }
    }

    return minDist; // Return the minimum distance
}

// Custom class to represent a point in the 2D grid
  static class Point {
      int row;
      int col;

      public Point(int row, int col) {
          this.row = row;
          this.col = col;
      }
  }
}

//Time Complexity : O(N*M)
//Space Complexity : O(N*M)
