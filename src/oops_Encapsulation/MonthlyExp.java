package oops_Encapsulation;

public class MonthlyExp {
	private int dailyExp;
	public int getDailyExp() {
		return dailyExp;
	}
	public void setDailyExp(int dailyExp) {
		this.dailyExp = dailyExp;
	}
	public int getWeeklyExp() {
		return weeklyExp;
	}
	public void setWeeklyExp(int weeklyExp) {
		this.weeklyExp = weeklyExp;
	}
	public int getMonthlyExp() {
		return monthlyExp;
	}
	public void setMonthlyExp(int monthlyExp) {
		this.monthlyExp = monthlyExp;
	}
	private int weeklyExp;
	private int monthlyExp;
	
	
}