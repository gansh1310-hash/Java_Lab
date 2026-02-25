#include<stdio.h>
int Binarysearch(int ar[],int size,int data)
{
    int low,mid,high;
    low=0;
    high=size-1;
    //keep searching until low<=high
    while(low<=high)
    {
        mid=(low+high)/2;
        if(ar[mid]==data)

            return mid;

        if(ar[mid]<data)

             low=mid+1;

                else
             high=mid-1;
    }

    return -1;
}
int main()
{
    //sorted array should be there for binary search
    int ar[]={1,5,7,21,35,56};
   int size=sizeof(ar)/sizeof (int);
    int data=35;
   int searchindex=Binarysearch(ar,size,data);
  printf("the element %d was found at index %d \n",data,searchindex);
    return 0;
}
