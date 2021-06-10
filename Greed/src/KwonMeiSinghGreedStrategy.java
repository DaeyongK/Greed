public class KwonMeiSinghGreedStrategy extends GreedStrategy{
	public int choose(GreedOption[] options, int[] dice, int bank) {
		int maxPointsOption = 0, maxPoints = 0, numOptions15 = 0;
		int rollAgainOption = -1;
		for (int i = 0; i < options.length; i++) {
			if (options[i].optionType() == 2) {
				ScoringCombination a = (ScoringCombination) options[i];
				if (a.getValue() > maxPoints) {
					maxPointsOption = i;
					maxPoints = a.getValue();
				}
				if (a.numDice() == 1) {
					numOptions15++;
				}
			} else if (options[i].optionType() == 1) {
				rollAgainOption = i;
			}
		}
		if (maxPoints > 100) {
			return maxPointsOption;
		} else if (rollAgainOption == -1) {
		 	return maxPointsOption;
		} else if (numOptions15 == dice.length) {
			return maxPointsOption;
		} else if (dice.length > 4) {
			return rollAgainOption;
		} else if (maxPoints > 0) {		
			return maxPointsOption;
		} else if (dice.length > 2) {
			return rollAgainOption;
		} else {
			return options.length+1;
		}
	}
	public String playerName() {
		return author() + "'s Strategy";
	}
	public String author() {
		return "Daeyong K, Jonathan M, Suraj S";
	}
}