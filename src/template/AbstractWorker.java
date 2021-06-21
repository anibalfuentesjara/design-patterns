package template;

public abstract class AbstractWorker implements Worker {

	@Override
	public void dailyRoutine() {
		this.getUp();
		this.haveBreakfast();
		this.goToWork();
		this.work();
		this.returnToHome();
		this.relax();
		this.goToSleep();
	}

	@Override
	public void getUp() {
		System.out.println("Get up");
	}

	@Override
	public void haveBreakfast() {
		System.out.println("Have breakfast");
	}

	@Override
	public void goToWork() {
		System.out.println("Going to work");
	}
	
	public abstract void work();

	@Override
	public void returnToHome() {
		System.out.println("Return to home");
	}

	@Override
	public void relax() {
		System.out.println("Relaxing");
	}

	@Override
	public void goToSleep() {
		System.out.println("Going to sleep");
	}

}
