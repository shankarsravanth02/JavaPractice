class HeapSortDemo
{
static void heapify(int arr[],int s,int i)
{
int largest=i;
int left=2*i+1;
int right=2*i+2;
if(left<s && arr[left]>arr[largest])
largest=left;
if(right<s && arr[right]>arr[largest])
largest=right;
if(largest!=i)
{
int temp=arr[i];
arr[i]=arr[largest];
arr[largest]=temp;
heapify(arr,s,largest);
}
}
static void heapSort(int arr[],int s)
{
for(int i=s-1;i>=0;i--)
heapify(arr,s,i);
for(int i=s-1;i>=0;i--)
{
int temp=arr[0];
arr[0]=arr[i];
arr[i]=temp;
heapify(arr,i,0);
}
}
static void display(int arr[],int s)
{
for(int i=0;i<s;i++)
System.out.print(arr[i]+ "  ");
System.out.println();
}
public static void main(String str[])
{
int arr[]={15,20,7,0,30};
int size=arr.length;
System.out.println("Before Sorting ");
display(arr,size);
heapSort(arr,size);
System.out.println("After Sorting ");
display(arr,size);
}
}