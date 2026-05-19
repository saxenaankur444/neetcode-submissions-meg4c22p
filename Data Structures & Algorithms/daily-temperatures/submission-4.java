class Solution {
   private static int[] dailyTemperatures(int[] temperatures) {

		int n = temperatures.length;
		int[] res = new int[n];

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < n; i++) {
			System.out.println("i : " + i);
			while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
				System.out.println("while");
				for (int x : stack)
					System.out.print(x + " ");
				int prevIndex = stack.pop();
				res[prevIndex] = i - prevIndex;
				System.out.println("\nRES");
				for (int x : res)
					System.out.print(x + " ");
			}
			stack.push(i);
			System.out.println("\nAf ");
			for (int x : stack)
				System.out.print(x + " ");
			System.out.println("\n-------------------");
		}

		return res;
   }
}
