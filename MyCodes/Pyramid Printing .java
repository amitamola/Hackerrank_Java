//https://www.educative.io/courses/learn-java-from-scratch/NEX7vr4r0vK

class PrintPyramid {
    public static void test(int rows) 
    {
        for (int i=0; i<rows; i++)
        {
            for (int j=0; j<i+1;j++)
            {
                System.out.print("# ");
            }
            System.out.println();
        }
    
    }
}
