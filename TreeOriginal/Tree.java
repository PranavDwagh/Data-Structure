
public class Tree {

	Node root;

	public Tree() {
		root = null;
	}
	
	public void insert(int value)
	{
		
		//root = insertValue(root, value);
	//	root = insertValue(root, value);        // uncomment it for recursive mode 
		
 		Node tmp = new Node(value);
		
		if(root == null)
		{ 
			//First node;
			root = tmp;
		}
		else
		{
			Node it = root;
			//We have some nodes in our tree....
			while(true)
			{
				if(tmp.getData() < it.getData())
				{
					if(it.getLeft() != null )
						it = it.getLeft();
					else
					{
						// It is pointing to your parent node...
						it.setLeft(tmp);
						break;
					}
				}
				else if (tmp.getData() > it.getData())
				{
					if(it.getRight() != null)
						it = it.getRight();
					else
					{
						// It is pointing to your parent node...
						it.setRight(tmp);
						break;
					}
				}
				else
				{
					System.out.println("Duplicate Number!!");
					break;
				}
			}
		}
	}
	
	private Node insertValue(Node it, int value) 
	{
		if(it != null)
		{
			if(value < it.getData())
			{
				Node tmp = insertValue(it.getLeft(), value);
				it.setLeft(tmp);
			}
			else if(value > it.getData())
			{
				Node tmp = insertValue(it.getRight(), value);
				it.setRight(tmp);
			}
			return it;
		}
		else
		{
			Node tmp = new Node(value);
			return tmp;
		}
	}

	public void preOrderPrint()
	{
		preOrder(root);
		System.out.println();
	}
	
	private void preOrder(Node it) 
	{
		if(it != null)
		{
			System.out.print(it.getData() + ", ");
			preOrder(it.getLeft());
			preOrder(it.getRight());
		}
	}
	
	public void inOrderPrint()
	{  
		inOrder(root);
		System.out.println();
	}
	
	private void inOrder(Node it)   /// L R P
	{
		if(it != null)
		{
			inOrder(it.getLeft());
			System.out.print(it.getData() + ", ");
			inOrder(it.getRight());
		}
	}
	
	public void postOrderPrint()
	{
		postOrder(root);
		System.out.println();
	}
	
	private void postOrder(Node it)   /// L R P
	{
		if(it != null)
		{
			postOrder(it.getLeft());
			postOrder(it.getRight());
			System.out.print(it.getData() + ", ");
		}
	}

	public void printSmallestValue() 
	{
		if(root == null)
		{
			System.out.println("Empty!");
		}
		else
		{
			Node it = root;

			while(it.getLeft() != null)
			{
				it = it.getLeft();
			}
			
			System.out.println(it.getData());
		}
	}
	
	public void printLargestValue() 
	{
		if(root == null)
		{
			System.out.println("Empty!");
		}
		else
		{
			Node it = root;

			while(it.getRight() != null)
			{
				it = it.getRight();
			}
			
			System.out.println(it.getData());
		}
	}

	public void search(int value) 
	{
		Node it = root;
		if(root == null)
		{
			System.out.println("Not Found");
		}
		else
		{
			while(it != null)
			{
				if(value == it.getData())
					break;
				else if(value < it.getData())
					it = it.getLeft();
				else
					it = it.getRight();
			}
			
			if(it != null)
				System.out.println("Found!");
			else
				System.out.println("Not Found!");
		}
	}

	public void delete(int value) 
	{
		root = deleteValue(root, value);
	}

	private Node deleteValue(Node it, int value) 
	{
		
		if(it == null)
		{
			return it;
			
		}
		else
		{
			if(value < it.getData())
			{
				Node tmp = deleteValue(it.getLeft(), value);
				it.setLeft(tmp);
			}
			
			else if(value > it.getData())
			{
	  			Node tmp = deleteValue(it.getRight(), value);
				it.setRight(tmp);
			}
			
			else
			{
				// we reach the node with data=value
				if(it.getRight() == null)
				{
					//we have something in left or it is also null...
					//handover your left side to your parent..
					Node tmp =  it.getLeft();
					it.setLeft(null);
					return tmp;
				}				
				else if(it.getLeft() == null)
				{
					//we have something in right or it is also null...
					//handover your right side to your parent..
					Node tmp =  it.getRight();
					it.setRight(null);
					return tmp;
				}
				else
				{
					//Ok.. current node have both left and right value...
					
					//Find the Max value from the Left subtree
					Node tmp = getMaxValueNode(it.getLeft());
					
					//Swap(it.data, tmp.data)
					int x = it.getData();
					it.setData( tmp.getData() );
					tmp.setData(x);
					
					it.setLeft(deleteValue( it.getLeft(), tmp.getData() ));
				}
			}
		}
		return it;
	}

	private Node getMaxValueNode(Node itn) 
	{
		while(itn.getRight() != null)
		{
			itn = itn.getRight();
		}
		return itn;
	}
	
}
