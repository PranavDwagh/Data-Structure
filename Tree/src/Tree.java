
public class Tree {

	Node root;

	public Tree()
	{
		root = null;
	}

	public void insert(int value)					//insert function without recursion
	{
		Node temp = new Node (value);
		if(root == null)
		{
			root = temp;
		}
		else 
		{
			Node it = root;
			while(true)
			{
				if(temp.getData() < it.getData())
				{
					if(it.getLeft() != null)
					{
						it = it.getLeft();
					}
					else
					{
						it.setLeft(temp);
						break;
					}
				}
				else if(temp.getData()> it.getData())
				{
					if(it.getRight() != null)
					{
						it = it.getRight();
					}
					else
					{
						it.setRight(temp);
						break;
					}
				}
				else
				{
					System.out.println("Duplicate Value");
				}
			}
		}
	}

	public void insertRec(int value)
	{
		root = insertRec1(root ,value);

	}

	public Node insertRec1(Node it, int value)						// this insert function with recursion .....use any one
	{
		if (it != null)
		{
			if(value <it.getData())
			{
				Node temp = insertRec1(it.getLeft(), value);
				it.setLeft(temp);
			}
			else if(value > it.getData())
			{
				Node temp = insertRec1(it.getRight(), value);
				it.setRight(temp);
			}
			return it;
		}

		else
		{
			Node temp = new Node (value);
			return temp;
		}
	}

	public void preorderPrint()
	{
		preorder(root);
		System.out.println();
	}

	public void preorder(Node it)
	{
		if (it != null)
		{
			System.out.print(it.getData()+ ", ");
			preorder(it.getLeft());
			preorder(it.getRight());
		}
	}

	public void inorderPrint()
	{
		inorder(root);
		System.out.println();
	}

	public void inorder(Node it)
	{
		if (it != null)
		{
			inorder(it.getLeft());
			System.out.print(it.getData()+", ");
			inorder (it.getRight());
		}
	}

	public void postorderPrint()
	{
		postorder(root);
		System.out.println();
	}

	public void postorder(Node it)
	{
		if(it != null)
		{
			postorder(it.getLeft());
			postorder(it.getRight());
			System.out.print(it.getData()+", ");
		}
	}

	public void search(int value)
	{
		Node it = root;
		if (root == null)
		{
			System.out.println("Empty Tree");
		}
		else
		{
		//	boolean flag = false;

			while (it !=null)
			{
				if(value == it.getData())
				{
					//flag = true;
					break;
				}
				else if(value< it.getData())
					it = it.getLeft();
				else
					it = it.getRight();
			}
			//if(it!=null || flag == true)
				if(it!=null)
				System.out.println("Found!!!");
			else
				System.out.println("Not Found!!");
		}
	}





}

























