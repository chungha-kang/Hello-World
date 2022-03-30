package exam07;

import java.util.Objects;

public class Money {
	private String Position;
	private int Wage;
	private int Bonus;
	private int Card;
	
	public String getPosition() {
		return Position;
	}
	
	public void setPosition(String position) {
		Position = position;
	}
	
	public int getWage() {
		return Wage;
	}
	
	public void setWage(int wage) {
		Wage = wage;
	}
	
	public int getBonus() {
		return Bonus;
	}
	
	public void setBonus(int bonus) {
		Bonus = bonus;
	}
	
	public int getCard() {
		return Card;
	}
	
	public void setCard(int card) {
		Card = card;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(Bonus, Card, Position, Wage);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		return Bonus == other.Bonus && Card == other.Card && Objects.equals(Position, other.Position)
				&& Wage == other.Wage;
	}

	@Override
	public String toString() {
		return "Employee [Position=" + Position + ", Wage=" + Wage + ", Bonus=" + Bonus + ", Card=" + Card + "]";
	}
	
	
}
