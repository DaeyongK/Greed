public class KwonMeiSinghGreedStrategy extends GreedStrategy{
	public int choose(GreedOption[] options, int[] dice, int bank) {
		int maxPointsOption = 0, maxPoints = 0;
		int rollAgainOption = -1;
		for (int i = 0; i < options.length; i++) {
			if (options[i].optionType() == 2) {
				ScoringCombination a = (ScoringCombination) options[i];
				if (a.getValue() > maxPoints) {
					maxPointsOption = i;
					maxPoints = a.getValue();
				}
			} else if (options[i].optionType() == 1) {
				rollAgainOption = i;
			}
		}
		if (maxPoints <= )
		if (maxPoints <= 100 && dice.length > 4 && rollAgainOption >=0) {
			return rollAgainOption;
		} else if (dice.length == 2 && bank <=300) {
			return 
		}
		
	}
	public String playerName() {
		return playerName() + "'s Strategy";
	}
	public String author() {
		return "Daeyong K, Jonathan M, Suraj S";
	}
}
