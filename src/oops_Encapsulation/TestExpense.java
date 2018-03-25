package oops_Encapsulation;

public class TestExpense {

	public static void main(String[] args) {
		MonthlyExp moExp=new MonthlyExp();
		moExp.setDailyExp(50);
		moExp.setWeeklyExp(350);
		moExp.setMonthlyExp(1600);
		System.out.println("daily expense is:"+moExp.getDailyExp()+ "\nweekly expense is:"+ moExp.getWeeklyExp()+ "\ndaily expense is:"+ moExp.getMonthlyExp());
		
 
	}

}
