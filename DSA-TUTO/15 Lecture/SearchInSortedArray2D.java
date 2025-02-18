import java.util.Arrays;

public class SearchInSortedArray2D {
  // sorted array - first element of a particular row is greater than the last
  // element of the previous row.

  public static void main(String[] args) {
    int[][] arr = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 },
    };
    System.out.println(Arrays.toString(search(arr, 9)));
  }

  // search in the row provided betwee the columns provided
  static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
    while (cStart <= cEnd) {
      int mid = cStart + (cEnd - cStart) / 2;
      if (matrix[row][mid] == target) {
        return new int[] { row, mid };
      }

      if (matrix[row][mid] < target) {
        cStart = mid + 1;
      } else {
        cEnd = mid - 1;
      }
    }
    return new int[] { -1, -1 };
  }

  static int[] search(int[][] matrix, int target) {
    // it may be possible that the matrix is of one dimension

    int rows = matrix.length;
    int cols = matrix[0].length; // be cautious matrix may be empty

    if (rows == 1) {
      return binarySearch(matrix, 0, 0, cols - 1, target);
    }

    int rStart = 0;
    int rEnd = rows - 1;
    int cMid = cols / 2;

    // run the loop till 2 rows are remaining

    while (rStart < (rEnd - 1)) { // while this is true it will have more than two rows

      int rMid = rStart + (rEnd - rStart) / 2;

      if (matrix[rMid][cMid] == target) {
        return new int[] { rMid, cMid };
      }

      if (matrix[rMid][cMid] < target) {
        rStart = rMid;
      } else {
        rEnd = rMid;
      }

    }

    // now we have two rows remaining
    // check whether the target is in the col of 2 rows

    if (matrix[rStart][cMid] == target) {
      return new int[] { rStart, cMid };
    }

    if (matrix[rStart + 1][cMid] == target) {
      return new int[] { rStart + 1, cMid };
    }

    // otherwise
    // search in 1st half
    if (target <= matrix[rStart][cMid - 1]) {
      return binarySearch(matrix, rStart, 0, cMid - 1, target);
    }
    // search in 2nd half
    if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
      return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
    }
    // search in 3rd half
    if (target <= matrix[rStart + 1][cMid - 1]) {
      return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
    }
    // search in 4th half
    if (target >= matrix[rStart + 1][cMid + 1]) {
      return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
    }

    return new int[] { -1, -1 };
  }
}
