#include<stdio.h>
int main(){
    int arr[100], n, i;

    // Input size of array
    printf("enter number of elemenats: ");
    scanf("%d", &n);

    // Input elements
    printf("Enter %d elements:\n", n);
    for(i =0; i < n; i++){
        scanf("%d", &arr[i]);
    }
     
    // Traverse and display elements
    printf("Array elements are:\n");
    for(i = 0; i < n; i++){
        printf("%d", arr[i]);
    }

    return 0;
}