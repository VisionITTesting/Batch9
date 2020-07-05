package temp.advance;

 class SubstractionNotToBeUsed extends AbstractOperations {

	public SubstractionNotToBeUsed(int num1,int num2) {
		super.num1 = num1;
		super.num2 = num2;
	}
	
	private void performSubOps() {
		super.result = super.num1 - super.num2;
	}
	
	@Override
	protected void performOperation() {
		performSubOps();
	}

}
