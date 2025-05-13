public class Main {
	public static void main(String[] args) {
		int[] unsorted = new int[]{9,8,7,6,5,4,3,2,1,0};
    int[] sorted = new int[]{0,1,2,3,4,5,6,7,8,9};

    int[] result = insertion_sort(unsorted);
    if (!sorted.equals(result)) {
      throw new IllegalStateException();
    }
    System.out.println("Well done.");
	}

  public static int[] insertion_sort(int[] unsorted) {
    int[] result = new int[unsorted.length];
    return result;
  }
}
