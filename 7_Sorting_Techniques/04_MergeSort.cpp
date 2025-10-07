#include <bits/stdc++.h>
using namespace std;

// Merges two sorted subarrays into one sorted array
void merge(vector<int> &arr, int left, int mid, int right)
{
    int n1 = mid - left + 1;  // size of left subarray
    int n2 = right - mid;     // size of right subarray

    vector<int> L(n1), R(n2);

    // Copy elements to temporary arrays
    for (int i = 0; i < n1; i++)
        L[i] = arr[left + i];
    for (int j = 0; j < n2; j++)
        R[j] = arr[mid + 1 + j];

    int i = 0, j = 0, k = left;

    cout << "Merging: ";
    for (int x = left; x <= right; x++)
        cout << arr[x] << " ";
    cout << endl;

    // Merge both halves into arr
    while (i < n1 && j < n2)
    {
        if (L[i] <= R[j])
            arr[k++] = L[i++];
        else
            arr[k++] = R[j++];
    }

    // Copy remaining elements of L[] and R[]
    while (i < n1)
        arr[k++] = L[i++];
    while (j < n2)
        arr[k++] = R[j++];

    cout << "After merging: ";
    for (int x = left; x <= right; x++)
        cout << arr[x] << " ";
    cout << endl << endl;
}

// Recursively divides the array
void mergeSort(vector<int> &arr, int left, int right)
{
    if (left >= right)
        return;

    int mid = left + (right - left) / 2;

    cout << "Dividing left half [" << left << " - " << mid << "]" << endl;
    mergeSort(arr, left, mid);

    cout << "Dividing right half [" << mid + 1 << " - " << right << "]" << endl;
    mergeSort(arr, mid + 1, right);

    merge(arr, left, mid, right);
}

int main()
{
    int size;
    cout << "Enter the size of your array: ";
    cin >> size;

    vector<int> arr(size);
    cout << "Enter array elements: ";
    for (int i = 0; i < size; i++)
        cin >> arr[i];

    cout << "\nInitial Array: ";
    for (int val : arr)
        cout << val << " ";
    cout << "\n\nStarting Merge Sort...\n\n";

    mergeSort(arr, 0, size - 1);

    cout << "Final Sorted Array: ";
    for (int val : arr)
        cout << val << " ";
    cout << endl;

    return 0;
}
