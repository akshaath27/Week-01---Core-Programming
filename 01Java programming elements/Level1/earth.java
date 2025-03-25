public class earth
{
	public static void main(String[]args)
	{
		double radofearth=6378;
		double volume=4/3*3.14*radofearth*radofearth*radofearth;
		double miles=volume*1.6;
		System.out.println("volume="+volume+"cubicmiles="+miles);
	}
}