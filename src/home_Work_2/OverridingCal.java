package home_Work_2;

public class OverridingCal extends OverLoading{
	@Override
	public void Cal() {
		System.out.println("Nothing to Cal");
	}
	@Override
	public void Cal(int a, int b) {
		System.out.println("Adding :"+(a+b+2));
	}
	
    @Override
	public void Cal(Double a,Double b) {
		System.out.println("Adding Double value :"+(a+b-3));
	}
	
	
}
