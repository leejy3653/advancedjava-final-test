package prob03;

public class Money {
	private int amount;

	public Money(int amt) {
		this.amount = amt;

	}

	public Object add(Money m) {
		return new Money(this.amount + m.amount);
	}

	public Object minus(Money m) {
		return new Money(this.amount - m.amount);
	}

	public Object multiply(Money m) {
		return new Money(this.amount * m.amount);
	}

	public Object devide(Money m) {
		return new Money(this.amount / m.amount);
	}

	@Override
	public boolean equals(Object obj) {
		return (obj instanceof Money && ((Money) obj).amount == this.amount) ? true : false;
	}

}