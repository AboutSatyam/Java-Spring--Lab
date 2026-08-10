package practiceProblem106to115;

class InterfacePrime110 {

	@FunctionalInterface
	public interface truth {

		boolean isCandidate(int num);
	}

	public static void main(String[] args) {

		truth t = num -> {

			if (num < 2) {
				return false;
			}

			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					return false;
				}
			}

			return true;
		};

		System.out.println(t.isCandidate(17));
	}
}