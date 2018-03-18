
public class LegoMosaics {

	static int columns/* = 1000 */;
	static int[] block = new int[] { 1, 2, 3, 4, 6, 8, 10, 12, 16 };

	int[] repetitions;
	int[] combinations;
	int biggestSeq;

	public LegoMosaics(int columns) {
		this.columns = columns;
		this.repetitions = new int[columns + 1];
		this.combinations = new int[columns + 1];
	}

	void addLine(String spots) {

		char last = spots.charAt(0);
		int blockSize = last == '.' ? 0 : 1;

		for (int x = 1; x < columns; x++) {

			char current = spots.charAt(x);
			
			if (last != '.' && current != last) {
				repetitions[blockSize]++;
				blockSize = (current == '.') ? 0 : 1;
			} else {
				if (current != '.') {
					blockSize++;
					biggestSeq = Math.max(blockSize, biggestSeq);
				}
			}
			last = current;
		}
		if (blockSize > 0) {
			repetitions[blockSize]++;
		}
	}

	int calc() {
		int result = 1;

		for (int i = 1; i <= biggestSeq; i++) {
			result *= Math.pow(combinations[i], repetitions[i]);
		}

		return result;
	}

	void fillCombi() {
		combinations[0] = 1;
		for (int i = 1; i <= biggestSeq; i++) {
			combinations[i] = sumPrev(i);
		}
	}

	int sumPrev(int i) {
		int sumP = 0;
		for (int j = 0; j < block.length && block[j] <= i; j++) {
			sumP += combinations[i - block[j]];
		}
		return sumP;
	}

}
