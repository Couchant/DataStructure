public class Main {

    public static void main(String[] args) {
	// write your code here
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i;
        }

        int scores[] = new int[]{100,98,87};
        for (int i :
                scores) {
            System.out.println(i);
        }
    }
}
