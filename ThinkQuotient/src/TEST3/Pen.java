package TEST3;

public class Pen{
	private String brand,inkColor,materialType;
	private int capLength,length,width;

	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	public String getBrand()
	{
		return brand;
	}

	public void setInkColor(String inkColor)
	{
		this.inkColor=inkColor;
	}
	public String getInkColor()
	{
		return inkColor;
	}

	public void setMaterialType(String materialType)
	{
		this.materialType=materialType;
	}
	public String getMaterialType()
	{
		return materialType;
	}

	public void setCapLength(int capLength)
	{
		this.capLength=capLength;
	}
	public int getCapLength()
	{
		return capLength;
	}

	public void setLength(int length)
	{
		this.length=length;
	}
	public int getLength()
	{
		return length;
	}
	
	public void setWidth(int width)
	{
		this.width=width;
	}
	public int getWidth()
	{
		return width;
	}

	public static void main(String [] hitendra)
	{
		Pen p1=new Pen();
		p1.setBrand("Reynold");
		p1.setInkColor("Black");
		p1.setMaterialType("Steel");
		p1.setCapLength(20);
		p1.setLength(13);
		p1.setWidth(9);

		System.out.println(p1.getBrand());
		System.out.println(p1.getInkColor());
		System.out.println(p1.getMaterialType());
		System.out.println(p1.getCapLength());
		System.out.println(p1.getLength());
		System.out.println(p1.getWidth());
	}

}