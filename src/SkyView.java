public class SkyView {
    private double [][] view;
    public SkyView(int numRows, int numCols, double[] scanned)
    {
        view = new double[numRows][numCols];
        int scannedIndex = 0;
        for(int row = 0; row < numRows; row++)
        {
            if( row % 2 == 0)
            {
                for(int col = 0; col < numCols; col++)
                {
                    view[row][col] = scanned[scannedIndex];
                    scannedIndex++;
                }
            }
            else
            {
                for(int col = numCols - 1; col >= 0; col--)
                {
                    view[row][col] = scanned[scannedIndex];
                    scannedIndex++;
                }
            }
            for (int col = 0; col < view[0].length; col++)
            {
                System.out.print(view[row][col] + " ");
            }
            System.out.println();
        }
    }
    public double getAverage(int startRow, int endRow, int startCol, int endCol)
    {
        double sum = 0;
        int count = 0;

        for(int row = startRow; row <= endRow; row++)
        {
            for(int col = startCol; col <= endCol; col++)
            {
                sum += view[row][col];
                count++;
            }
        }

        return sum / count;
    }
}