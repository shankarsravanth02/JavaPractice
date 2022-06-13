class TreeDemo
{
static class Node
{
int data;
Node left,right;
Node(int data)
{
this.data=data;
left=null;
right=null;
}
}

void add(Node n,int data)
{
if(data<n.data)
{
if(n.left!=null)
{
add(n.left,data);
}
else
n.left=new Node(data);
}
else if(data>n.data)
{
if(n.right!=null)
{
add(n.right,data);
}
else n.right=new Node(data);
}
}
void inorderTraversal(Node n)
{
if(n!=null)
{
inorderTraversal(n.left);
System.out.println(" "+n.data);
inorderTraversal(n.right);
}
}
void preorderTraversal(Node n)
{
if(n!=null)
{
System.out.println(" "+n.data);
preorderTraversal(n.left);
preorderTraversal(n.right);
}
}
void postorderTraversal(Node n)
{
if(n!=null)
{
postorderTraversal(n.left);
postorderTraversal(n.right);
System.out.println(" "+n.data);
}
}
public static void main(String str[])
{
TreeDemo td=new TreeDemo();
Node root=new Node(10);
td.add(root,2);
td.add(root,4);
td.add(root,7);
td.add(root,15);
td.add(root,20);
System.out.println("printing tree (inorder)  ");
td.inorderTraversal(root);
System.out.println("printing tree (preorder)");
td.prerderTraversal(root);
System.out.println("printing tree (postorder)");
td.postrderTraversal(root);
}
}