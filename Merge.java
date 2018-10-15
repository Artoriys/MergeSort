public class Merge {

    static void merge(int A[], int p, int q, int r)
    {
        int m1 = q - p + 1;
        int m2 = r - q;
        int L[] = new int [m1];
        int R[] = new int [m2];
        for (int i=0; i<m1; ++i)
            L[i] = A[p + i];
        for (int j=0; j<m2; ++j)
            R[j] = A[q + 1+ j];

        int i = 0, j = 0;

        int k = p;
        while (i < m1 && j < m2)
        {
            if (L[i] <= R[j])
            {
                A[k] = L[i];
                i++;
            }
            else
            {
                A[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < m1)
        {
            A[k] = L[i];
            i++;
            k++;
        }

        while (j < m2)
        {
            A[k] = R[j];
            j++;
            k++;
        }
    }

}
