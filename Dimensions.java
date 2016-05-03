
public class Dimensions {
	
	int dim_no;
	String concated = new String();
	
	
	public Dimensions(int dim_no)
	{
		this.dim_no=dim_no;
		
	}
	public String[] dim = new String[dim_no];
	
	public void print_dim()
	{
		for(int i=0;i<dim.length;i++)
		{
			System.out.print(dim[i] +" ");
		}
		
		System.out.println("");
	}
	
	public void setDimensions(String[] val)
	{
		dim=val;
	}
	
	public void buildConcat()
	{   StringBuilder temp = new StringBuilder();
		for(String s : dim)
			temp.append(s);
		
		concated=temp.toString();
	}
}
