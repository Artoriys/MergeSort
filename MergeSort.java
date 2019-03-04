class MergeSort 
{ 
    
    void sort(int A[], int p, int r)
    { 
        if (p < r)
        {
            int q = (p+r)/2;
            sort(A, p, q);
            sort(A , q+1, r);

            Merge.merge(A, p, q, r);
        } 
    }

    public static void main( String args[])
    { 
        int A[] = {5, 2, 4, 6, 1, 3, 2, 6};
  
        System.out.println("Входной массив");
        for (int i=0; i<A.length; ++i)
            System.out.print(A[i] + " ");
  
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(A, 0, A.length-1);

        System.out.println(" ");
        System.out.println("Сортированный массив");
        for (int i=0; i<A.length; ++i)
            System.out.print(A[i] + " ");
    } 
} 
