import java.util.Arrays;

class Wal2 {
    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0, j = people.length - 1;
        int ans = 0;

        while (i <= j) {
            ans++;
            if (people[i] + people[j] <= limit)
                i++;
            j--;
        }

        return ans;
    }
    public static void main(String[] args) {
    	int[] ar={1,2};
    	int limit=3;
    	int n=numRescueBoats(ar,limit);
    	System.out.println(n);
	}
}